package com.gatellier.myapplication

fun main(args: Array<String>){

    // var = modifiable / val = non modifiable

    val hello : String? = "Hello"

    var hello1 = "Hello"

    // hello = "world" Error car val est pas modifiable
    // hello1 = "world" modification de hello1 car var est modifiable
    // hello1 = 1  Error add .toString()

    print(hello1 + "bonjour")
}

