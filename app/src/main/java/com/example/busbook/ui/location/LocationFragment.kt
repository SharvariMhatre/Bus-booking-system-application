package com.example.busbook.ui.location

import android.Manifest
import android.annotation.SuppressLint
import android.content.pm.PackageManager
import android.location.Geocoder
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.example.busbook.databinding.LocationpageBinding
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import java.util.Locale

class LocationFragment : Fragment() {

    private var _binding: LocationpageBinding? = null
    private val binding get() = _binding!!

    private lateinit var fusedClient: FusedLocationProviderClient

    private val requestLocation = registerForActivityResult(
        ActivityResultContracts.RequestPermission()
    ) { granted ->
        if (granted) showLocation()
        else Toast.makeText(requireContext(), "Location permission denied", Toast.LENGTH_SHORT).show()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = LocationpageBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fusedClient = LocationServices.getFusedLocationProviderClient(requireActivity())

        binding.btn.setOnClickListener {
            if (hasFineLocation()) showLocation()
            else requestLocation.launch(Manifest.permission.ACCESS_FINE_LOCATION)
        }
    }

    private fun hasFineLocation(): Boolean =
        ContextCompat.checkSelfPermission(
            requireContext(),
            Manifest.permission.ACCESS_FINE_LOCATION
        ) == PackageManager.PERMISSION_GRANTED

    @SuppressLint("MissingPermission")
    private fun showLocation() {
        if (!hasFineLocation()) return
        fusedClient.lastLocation.addOnSuccessListener { location ->
            if (_binding == null) return@addOnSuccessListener
            if (location == null) {
                Toast.makeText(requireContext(), "Location unavailable", Toast.LENGTH_SHORT).show()
                return@addOnSuccessListener
            }
            try {
                val geocoder = Geocoder(requireContext(), Locale.getDefault())
                val list = geocoder.getFromLocation(location.latitude, location.longitude, 1)
                val addr = list?.firstOrNull() ?: return@addOnSuccessListener
                binding.TVlatt.text = "Latitude: ${addr.latitude}"
                binding.TVlong.text = "Longitude: ${addr.longitude}"
                binding.Tvadd.text = addr.getAddressLine(0)
                binding.TVloc.text = addr.locality
                binding.TVcountry.text = addr.countryName
            } catch (e: Exception) {
                Toast.makeText(requireContext(), "Geocoding failed", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
