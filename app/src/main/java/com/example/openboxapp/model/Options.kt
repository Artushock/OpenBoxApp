package com.example.openboxapp.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Options(
    val boxAmount: Int,
    val isTimerEnabled: Boolean
) : Parcelable {
    companion object {
        @JvmStatic
        val DEFAULT = Options(boxAmount = 3, isTimerEnabled = false)
    }
}