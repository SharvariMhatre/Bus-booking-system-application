package com.example.busbook.ui.register

import android.os.Bundle
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.busbook.R
import com.example.busbook.data.db.AppDatabase
import com.example.busbook.data.db.ProfileEntity
import com.example.busbook.databinding.RegistrationPageBinding
import com.google.firebase.auth.FirebaseAuth
import kotlinx.coroutines.launch

class RegisterFragment : Fragment() {

    private var _binding: RegistrationPageBinding? = null
    private val binding get() = _binding!!

    private val auth: FirebaseAuth by lazy { FirebaseAuth.getInstance() }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = RegistrationPageBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.txtLinkLogin.setOnClickListener {
            findNavController().navigate(R.id.action_register_to_login)
        }

        // If user is already signed in, skip straight to the profile screen.
        if (auth.currentUser != null) {
            findNavController().navigate(R.id.action_register_to_profile)
            return
        }

        binding.buttonCreate.setOnClickListener { attemptRegister() }
    }

    private fun attemptRegister() {
        val firstName = binding.us1.text.toString().trim()
        val email = binding.us2.text.toString().trim()
        val phone = binding.us3.text.toString().trim()
        val password = binding.mpss.text.toString().trim()

        if (TextUtils.isEmpty(email)) {
            binding.us2.error = "Email is Required"
            return
        }
        if (TextUtils.isEmpty(password)) {
            binding.mpss.error = "Password is Required"
            return
        }
        if (password.length < 7) {
            binding.mpss.error = "Password must be at least 7 characters"
            return
        }

        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener { task ->
                if (_binding == null) return@addOnCompleteListener
                if (task.isSuccessful) {
                    Toast.makeText(requireContext(), "User Created", Toast.LENGTH_SHORT).show()
                    val uid = auth.currentUser?.uid ?: return@addOnCompleteListener
                    val profile = ProfileEntity(uid, firstName, email, phone)
                    lifecycleScope.launch {
                        AppDatabase.get(requireContext()).profileDao().upsert(profile)
                        findNavController().navigate(R.id.action_register_to_profile)
                    }
                } else {
                    Toast.makeText(
                        requireContext(),
                        "Error! ${task.exception?.message}",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
