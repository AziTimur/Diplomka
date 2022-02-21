package com.example.diplomka

import android.media.Image
import java.util.*

data class Caps (
    val brand:String,
    val price:Double,
    val id:Int,
    val list: List<Caps>,
    val image: Int

)