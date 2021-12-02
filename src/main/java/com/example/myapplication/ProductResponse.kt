package com.example.myapplication

import com.google.gson.annotations.SerializedName

data class ProductResponse (
    @SerializedName("response" ) var response : Response? = Response(),
    @SerializedName("error"    ) var error    : String?   = null
)

data class Additives (

    @SerializedName("E322" ) var E322 : String? = null,
    @SerializedName("E407" ) var E407 : String? = null,
    @SerializedName("E410" ) var E410 : String? = null,
    @SerializedName("E412" ) var E412 : String? = null,
    @SerializedName("E471" ) var E471 : String? = null,
    @SerializedName("E492" ) var E492 : String? = null,
    @SerializedName("E503" ) var E503 : String? = null

)

data class NutrientLevels (

    @SerializedName("fat"          ) var fat          : String? = null,
    @SerializedName("salt"         ) var salt         : String? = null,
    @SerializedName("saturatedFat" ) var saturatedFat : String? = null,
    @SerializedName("sugars"       ) var sugars       : String? = null

)

data class NutritionFacts (

    @SerializedName("servingSize"  ) var servingSize  : String?             = null,
    @SerializedName("calories"     ) var calories     : String?             = null,
    @SerializedName("fat"          ) var fat          : NutritionFactsItem? = null,
    @SerializedName("saturatedFat" ) var saturatedFat : NutritionFactsItem? = null,
    @SerializedName("carbohydrate" ) var carbohydrate : NutritionFactsItem? = null,
    @SerializedName("sugar"        ) var sugar        : NutritionFactsItem? = null,
    @SerializedName("fiber"        ) var fiber        : NutritionFactsItem? = null,
    @SerializedName("proteins"     ) var proteins     : NutritionFactsItem? = null,
    @SerializedName("sodium"       ) var sodium       : NutritionFactsItem? = null,
    @SerializedName("salt"         ) var salt         : NutritionFactsItem? = null,
    @SerializedName("energy"       ) var energy       : NutritionFactsItem? = null

)

data class NutritionFactsItem (
    @SerializedName("unit"  ) var unit  : String,
    @SerializedName("perServing"  ) var perServing  : String,
    @SerializedName("per100g"  ) var per100g  : String,
)

data class Response (

    @SerializedName("name"                   ) var name                   : String?         = null,
    @SerializedName("altName"                ) var altName                : String?         = null,
    @SerializedName("barcode"                ) var barcode                : String?         = null,
    @SerializedName("picture"                ) var picture                : String?         = null,
    @SerializedName("quantity"               ) var quantity               : String?         = null,
    @SerializedName("brands"                 ) var brands                 : List<String>    = arrayListOf(),
    @SerializedName("countries"              ) var countries              : List<String>    = arrayListOf(),
    @SerializedName("manufacturingCountries" ) var manufacturingCountries : List<String>    = arrayListOf(),
    @SerializedName("nutriScore"             ) var nutriScore             : String?         = null,
    @SerializedName("novaScore"              ) var novaScore              : String?         = null,
    @SerializedName("ingredients"            ) var ingredients            : List<String>    = arrayListOf(),
    @SerializedName("traces"                 ) var traces                 : List<String>    = arrayListOf(),
    @SerializedName("additives"              ) var additives              : Additives?      = Additives(),
    @SerializedName("allergens"              ) var allergens              : List<String>    = arrayListOf(),
    @SerializedName("nutrientLevels"         ) var nutrientLevels         : NutrientLevels? = NutrientLevels(),
    @SerializedName("nutritionFacts"         ) var nutritionFacts         : NutritionFacts? = NutritionFacts(),
    @SerializedName("containsPalmOil"        ) var containsPalmOil        : Boolean?        = null

)