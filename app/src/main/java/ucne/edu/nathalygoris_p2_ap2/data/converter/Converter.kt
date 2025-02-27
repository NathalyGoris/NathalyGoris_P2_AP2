package ucne.edu.nathalygoris_p2_ap2.data.converter

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class Converter{

    fun convertToDate(millis: Long): String {
        val formatter = SimpleDateFormat("MM/dd/yyyy", Locale.getDefault())
        return formatter.format(Date(millis))
    }
}