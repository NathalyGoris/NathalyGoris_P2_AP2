package ucne.edu.nathalygoris_p2_ap2.data.remote.dto

import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface DepositoAPI {
    @GET("api/Depositos")
    suspend fun getDepositos(): List<DepositosDto>

    @POST("api/Depositos/")
    suspend fun addDepositos(@Body DepositosDto: DepositosDto): DepositosDto


}