package com.example.busbook.ui.profile

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.result.contract.ActivityResultContracts
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.busbook.R
import com.example.busbook.data.db.AppDatabase
import com.example.busbook.databinding.ProfilePageBinding
import com.github.dhaval2404.imagepicker.ImagePicker
import com.google.firebase.auth.FirebaseAuth
import kotlinx.coroutines.launch

class ProfileFragment : Fragment() {

    private var _binding: ProfilePageBinding? = null
    private val binding get() = _binding!!

    // Modern, lifecycle-safe replacement for startActivityForResult / onActivityResult.
    private val pickImage = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) { result ->
        if (result.resultCode == Activity.RESULT_OK) {
            val uri: Uri? = result.data?.data
            if (uri != null && _binding != null) {
                binding.profileImage.setImageURI(uri)
                persistPhoto(uri)
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = ProfilePageBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.fabCam.setOnClickListener {
            ImagePicker.with(this)
                .crop()
                .createIntent { intent -> pickImage.launch(intent) }
        }

        binding.locateMe.setOnClickListener {
            findNavController().navigate(R.id.action_profile_to_location)
        }

        binding.gotoLgout.setOnClickListener {
            FirebaseAuth.getInstance().signOut()
            findNavController().navigate(R.id.action_profile_to_login)
        }

        binding.gotoLg.setOnClickListener {
            findNavController().popBackStack()
        }

        loadProfile()
    }

    private fun loadProfile() {
        val uid = FirebaseAuth.getInstance().currentUser?.uid ?: return
        AppDatabase.get(requireContext()).profileDao().observe(uid).observe(viewLifecycleOwner) { p ->
            if (p == null) return@observe
            binding.displayUs.text = p.firstName
            binding.displayUs2.text = p.email
            binding.displayUs3.text = p.phone
            p.photoUri?.let { binding.profileImage.setImageURI(Uri.parse(it)) }
        }
    }

    private fun persistPhoto(uri: Uri) {
        val uid = FirebaseAuth.getInstance().currentUser?.uid ?: return
        lifecycleScope.launch {
            val dao = AppDatabase.get(requireContext()).profileDao()
            val existing = dao.get(uid) ?: return@launch
            dao.upsert(existing.copy(photoUri = uri.toString()))
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
