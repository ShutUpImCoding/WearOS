package com.example.mykotlinwearos.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.mykotlinwearos.presentation.navigation.AppNavHost
import com.example.mykotlinwearos.presentation.theme.MyKotlinWearOSTheme


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //dark theme set true for testing
            MyKotlinWearOSTheme(darkTheme = true)  {
                AppNavHost()
            }

        }
    }
}
