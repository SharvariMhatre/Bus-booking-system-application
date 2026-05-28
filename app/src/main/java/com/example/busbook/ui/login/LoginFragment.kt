package com.example.busbook.ui.login

import android.os.Bundle
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.busbook.R
import com.example.busbook.databinding.ActivityMainBinding
import com.google.firebase.auth.FirebaseAuth

/**
 * Login screen. Reuses the existing `activity_main.xml` layout (kept under that name to
 * avoid churn). Navigates to register or to the search flow on success.
 */
class LoginFragment : Fragment() {

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!

    private val auth: FirebaseAuth by lazy { FirebaseAuth.getInstance() }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = ActivityMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.txtLinkReg.setOnClickListener {
            findNavController().navigate(R.id.action_login_to_register)
        }

        binding.buttonLogin.setOnClickListener { attemptLogin() }
    }

    private fun attemptLogin() {
        val email = binding.email.text.toString().trim()
        val password = binding.password.text.toString().trim()

        if (TextUtils.isEmpty(email)) {
            binding.email.error = "Email is Required"
            return
        }
        if (TextUtils.isEmpty(password)) {
            binding.password.error = "Password is Required"
            return
        }
        if (password.length < 7) {
            binding.password.error = "Password must be at least 7 characters"
            return
        }

        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener { task ->
                // Guard against the fragment being destroyed mid-flight.
                if (_binding == null) return@addOnCompleteListener
                if (task.isSuccessful) {
                    Toast.makeText(requireContext(), "Logged In Successfully", Toast.LENGTH_SHORT).show()
                    findNavController().navigate(R.id.action_login_to_search)
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
