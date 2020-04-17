package com.e_suratpermintaan.core.data.entities.responses

import com.google.gson.annotations.SerializedName

data class BaseResponse(

	@field:SerializedName("api_code")
	val apiCode: String? = null,

	@field:SerializedName("message")
	val message: String? = null,

	@field:SerializedName("status")
	val status: Boolean? = null
)