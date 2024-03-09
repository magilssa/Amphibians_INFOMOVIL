package com.example.amphibians_infomovil.network

import com.example.amphibians_infomovil.model.Amphibian
import retrofit2.http.GET
interface AmphibiansApiService {
    @GET("amphibians")
    suspend fun getAmphibians(): List<Amphibian>
}