package com.e_suratpermintaan.core.domain.entities.responses

import com.google.gson.annotations.SerializedName

data class VerifikasiSPResponse(

	@field:SerializedName("api_code")
	val apiCode: String? = null,

	@field:SerializedName("data")
	val data: DataVerifikasi? = null,

	@field:SerializedName("message")
	val message: String? = null,

	@field:SerializedName("status")
	val status: Boolean? = null
)

data class DataVerifikasi(

	@field:SerializedName("id_pm")
	val idPm: String? = null,

	@field:SerializedName("catatan")
	val catatan: Any? = null,

	@field:SerializedName("status_permintaan")
	val statusPermintaan: Int? = null
)
