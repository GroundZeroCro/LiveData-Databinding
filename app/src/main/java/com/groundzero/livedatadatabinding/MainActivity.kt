package com.groundzero.livedatadatabinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.groundzero.livedatadatabinding.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {

    private val mainViewModel = MainViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main).apply {
            lifecycleOwner = this@MainActivity
            textObserved = mainViewModel.getText()
            updateTextBtn.setOnClickListener { mainViewModel.setText(UUID.randomUUID().toString()) }
        }
    }
}
