package xyz.teamgravity.channel

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.google.android.material.snackbar.Snackbar
import kotlinx.coroutines.flow.collect
import xyz.teamgravity.channel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val viewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            // collect events
            lifecycleScope.launchWhenStarted {
                viewModel.eventFlow.collect { event ->
                    when (event) {
                        is MainViewModel.MainEvent.ErrorEvent ->
                            Snackbar.make(parentLayout, event.message, Snackbar.LENGTH_LONG).show()
                    }
                }
            }


            // show button
            showB.setOnClickListener {
                viewModel.triggerEvent(resources)
            }
        }
    }
}