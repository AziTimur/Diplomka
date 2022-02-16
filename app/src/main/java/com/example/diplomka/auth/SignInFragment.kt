package com.example.diplomka.auth

import android.content.ContentValues
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.diplomka.R
import com.example.diplomka.databinding.FragmentMainBinding
import com.example.diplomka.databinding.FragmentSignInBinding


class SignInFragment : Fragment(R.layout.fragment_sign_in) {

    private val binding: FragmentSignInBinding by viewBinding()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvRegistrationSignIn.setOnClickListener{
            findNavController().navigate(R.id.registrationFragment)
            Log.e(ContentValues.TAG, "onViewCreated: $it")
        }
        binding.tvRecovery.setOnClickListener{
            findNavController().navigate(R.id.restorePasswordFragment)
            Log.e(ContentValues.TAG, "onViewCreated: $it")
        }
        binding.signInBtn.setOnClickListener{
            findNavController().navigate(R.id.homeFragment)
            Log.e(ContentValues.TAG, "onViewCreated: $it")
        }
    }
}