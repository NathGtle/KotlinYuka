package com.example.myapplication.screens

import android.os.Bundle
import android.telecom.Call
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.myapplication.R
import com.example.myapplication.services.network.NetworkService
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.fragment_details_summary.*
import kotlinx.android.synthetic.main.fragment_details_summary_score.*
import kotlinx.android.synthetic.main.fragment_details_summary_title.*
import kotlinx.coroutines.*
import java.lang.Exception

class HomeFragment : Fragment() {

    // setContentView
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(
            R.layout.fragment_home,
            container, false,
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.setOnClickListener {
            findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToDetailsFragment(barcode = "5449000133328"))
        }
    }
}
