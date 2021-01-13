package com.minions06.happyhome

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.platform.setContent
import com.minions06.happyhome.theme.HappyHomeTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyHomeTheme {
                Surface(color = MaterialTheme.colors.background) {
                }
            }
        }
    }
}
