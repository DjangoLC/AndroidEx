package com.example.examen.data

import com.google.gson.annotations.SerializedName

data class ItemRequestJson(

	@field:SerializedName("Usuario")
	var usuario: Usuario? = null,

	@field:SerializedName("Proyecto")
	var proyecto: Proyecto? = null
)