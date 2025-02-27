package ucne.edu.nathalygoris_p2_ap2.data.remote.dto

import java.time.LocalDate

data class HDepositosDto (
    val idDeposito: Int?,
    val fecha: LocalDate? = null,
    val idCuenta: Int? = null,
    val concepto: String? = null,
    val monto: Double? = null
)
