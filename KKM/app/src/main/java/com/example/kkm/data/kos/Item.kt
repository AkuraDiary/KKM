package com.example.kkm.data.kos

import android.os.Parcelable
import com.squareup.moshi.Json
import kotlinx.parcelize.Parcelize

@Parcelize
data class Item(

    @field:Json(name = "id")
    val id : String,

    @field:Json(name = "name")
    val name : String,

    @field:Json(name = "description")
    val description : String,

    @field:Json(name = "address")
    val address : String,

    @field:Json(name = "imageUrl")
    val imageUrl: String,

    @field:Json(name = "genderRestriction")
    val genderRestriction : String,

    @field:Json(name = "available_bedrooms")
    val available_bedrooms : Int,

    @field:Json(name = "total_bedrooms")
    val total_bedrooms : Int,

    @field:Json(name = "price")
    val price : Int
):Parcelable
