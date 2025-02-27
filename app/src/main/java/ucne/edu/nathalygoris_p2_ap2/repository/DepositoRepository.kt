package ucne.edu.nathalygoris_p2_ap2.repository

import ucne.edu.nathalygoris_p2_ap2.data.remote.dto.DepositoAPI
import ucne.edu.nathalygoris_p2_ap2.data.remote.dto.DepositosDto
import ucne.edu.nathalygoris_p2_ap2.utils.Resource
import javax.inject.Inject


class DepositoRepository @Inject constructor(
    private val depositoAPI: DepositoAPI
) {
    suspend fun getDepositos() : Resource<List<DepositosDto>>{
        val result = try {
            depositoAPI.getDepositos()
        } catch (e : Exception){
            return Resource.Error("error al obtener ")
        }
        return Resource.Success(result)
    }

    suspend fun addDeposito(DepositosDto: DepositosDto) : Resource<DepositosDto>{
        val result = try {
            depositoAPI.addDepositos(DepositosDto)
        } catch (e : Exception){
            return Resource.Error("error al crear")
        }
        return Resource.Success(result)
    }
}