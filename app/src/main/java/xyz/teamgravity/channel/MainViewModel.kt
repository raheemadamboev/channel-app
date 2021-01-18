package xyz.teamgravity.channel

import android.content.res.Resources
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    // create channel ! do not expose to fragment or activity
    private val eventChannel = Channel<MainEvent> { }

    // so receive it as flow
    val eventFlow = eventChannel.receiveAsFlow()

    // fake call
    fun triggerEvent(res: Resources) = viewModelScope.launch {
        eventChannel.send(MainEvent.ErrorEvent(res.getString(R.string.error)))
    }

    sealed class MainEvent {
        data class ErrorEvent(val message: String) : MainEvent()
    }
}