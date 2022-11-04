package com.sdk.authwithphone.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.firebase.auth.FirebaseAuth
import com.sdk.authwithphone.R

class SplashFragment: Fragment(R.layout.fragment_splash) {
    private lateinit var auth: FirebaseAuth
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        auth = FirebaseAuth.getInstance()
        if (auth.currentUser != null) {
            findNavController().navigate(R.id.action_splashFragment_to_thirdFragment)
        } else {
            findNavController().navigate(R.id.action_splashFragment_to_firstFragment)
        }
    }
}