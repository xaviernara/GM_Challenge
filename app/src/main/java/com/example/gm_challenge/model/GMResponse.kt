package com.example.gm_challenge.model


import kotlinx.android.parcel.Parcelize
import android.os.Parcelable


@Parcelize
data class GMResponse(
    val resultCount: Int?, // 50
    val results: List<Result>?
) : Parcelable