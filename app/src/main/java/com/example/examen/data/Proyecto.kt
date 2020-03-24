package com.example.examen.data

import com.google.gson.annotations.SerializedName

data class Proyecto(

	@field:SerializedName("Ufechadescarga")
	var ufechadescarga: Int? = null,

	@field:SerializedName("Id")
	var id: String? = null
)