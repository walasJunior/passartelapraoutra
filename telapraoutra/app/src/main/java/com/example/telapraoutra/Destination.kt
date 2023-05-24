package com.example.telapraoutra

sealed class Destination (var route: String){
    object ScreenSecond : Destination ("ScreenSecond")
    object ScreenFirst : Destination ("ScreenFirst")


}
