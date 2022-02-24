package com.example.retrofit_tifany_33.model

import com.google.gson.annotations.SerializedName

data class Province(
    @SerializedName("Kode_Provi")
    val code: Int,
    @SerializedName("Provinsi")
    val province: String,
    @SerializedName("Kasus_Posi")
    val positive: Int,
    @SerializedName("Kasus_Sembuh")
    val recover: Int,
    @SerializedName("Kasus_Meni")
    val death: Int
)