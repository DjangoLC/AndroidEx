package com.example.examen.data

import com.google.gson.annotations.SerializedName

class ItemsResponse(@SerializedName("getConjuntotiendasUsuarioResult") val items: List<Items>)