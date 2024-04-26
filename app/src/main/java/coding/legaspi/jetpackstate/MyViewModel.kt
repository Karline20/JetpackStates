package coding.legaspi.jetpackstate

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

/**
 * Created by Karlen Legaspi
 */
class MyViewModel : ViewModel() {

    var count by mutableStateOf(0)

    fun increaseCount(){
        count++
    }
}