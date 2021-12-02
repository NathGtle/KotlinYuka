package com.gatellier.myapplication

import androidx.annotation.StringRes

data class Product(
    val title: String,
    val brand: String,
    val thumbnail: String,
    val barcode: String,
    val nutriscore: NutriScore,
    val nova: Nova,
    val vegetarien: Boolean,
    val vegelalien: Boolean,
    val quantity: String,
    val countries: List<String>,
    val ingredients: List<String>,
    val allergens: List<String>,
    val additives: List<String>,

) {
}

enum class NutriScore(val character: Char) {
    A('a'), B('b'), C('c'), D('d'), E('e')
}

enum class Nova(@StringRes val textRes: Int) {
    nova_1(R.string.novascore_1),
    nova_2(R.string.novascore_2),
    nova_3(R.string.novascore_3),
    nova_4(R.string.novascore_4),
}

