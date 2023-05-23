package com.example.firebaserealtime.ui

import com.google.firebase.database.IgnoreExtraProperties

@IgnoreExtraProperties
data class Candado(val status: Boolean? = false) {
    // Null default values create a no-argument default constructor, which is needed
    // for deserialization from a DataSnapshot.
}