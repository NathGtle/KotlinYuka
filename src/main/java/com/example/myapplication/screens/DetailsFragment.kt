package com.example.myapplication.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapplication.R
import com.example.myapplication.services.network.NetworkService
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.fragment_details_summary.*
import kotlinx.android.synthetic.main.fragment_details_summary_score.*
import kotlinx.android.synthetic.main.fragment_details_summary_title.*
import kotlinx.coroutines.*
import java.lang.Exception

class DetailsFragment : Fragment() {

    // setContentView
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(
            R.layout.fragment_details_summary,
            container, false,
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        GlobalScope.launch(Dispatchers.Main) {
            hideContent()

            try {
                val result = withContext(Dispatchers.Default) {
                    NetworkService.api.getBarcodeById(DetailsFragmentArgs.fromBundle(requireArguments()).barcode).await()
                }

                product_name.text = result.response?.name
                product_brand.text = result.response?.brands?.joinToString(",")
                nova_desc.text = result.response?.novaScore
                nutriscore_picture.setImageResource(
                    resources.getIdentifier(
                        "nutriscore_${result.response?.nutriScore?.lowercase()}",
                        "drawable",
                        requireContext().packageName
                    )
                )
                Picasso.get().load(result.response?.picture).into(product_image)

                showContent()
            } catch (e: Exception) {}
        }
    }

    private fun hideContent()  {
        product_content.visibility = View.GONE
        product_image.visibility = View.GONE
        product_progress_bar.visibility = View.VISIBLE
    }

    private fun showContent()  {
        product_content.visibility = View.VISIBLE
        product_image.visibility = View.VISIBLE
        product_progress_bar.visibility = View.GONE
    }

}