package com.gatellier.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.fragment_details_summary.*
import kotlinx.android.synthetic.main.fragment_details_summary_nutriscore.*
import kotlinx.android.synthetic.main.fragment_details_summary_title.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_details_summary)

        val fakeProduct = Product(
            title = "Petits pois et carottes",
            brand = "Cassegrain",
            thumbnail = "https://cdn.discordapp.com/attachments/915202570702712912/915563913628749854/Placeholder.jpg",
            barcode = "3083680085304",
            nutriscore = NutriScore.C,
            nova = Nova.nova_1,
            vegetarien = false,
            vegelalien = true,
            quantity = "400 g (280 g net égoutté)",
            countries = listOf("France", "Japon", "Suisse"),
            ingredients = listOf("Petits pois 66%", "eau", "garniture 2,8% (salade, oignon grelot)", "sucre", "sel", "arôme naturel"),
            allergens = emptyList(),
            additives = emptyList(),
        )

        product_name.text = fakeProduct.title
        product_brand.text = fakeProduct.brand
        nova_desc.text = getString(fakeProduct.nova.textRes)
        Picasso.get().load(fakeProduct.thumbnail).into(image)

// progressBar visible and image invisible if load progressbar gone and image visible
        nutriscore_picture.setImageResource(
            resources.getIdentifier(
                "nutriscore_${fakeProduct.nutriscore.character.lowercase()}",
                "drawable",
                packageName
            )
        )
    }
}