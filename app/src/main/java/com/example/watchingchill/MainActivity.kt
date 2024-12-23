package com.example.watchingchill

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.watchingchill.ui.data.DiscoverScreenState
import com.example.watchingchill.ui.screens.DiscoverScreen
import com.example.watchingchill.ui.theme.ApplicationAppTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ApplicationAppTheme{
                Scaffold(modifier = Modifier.fillMaxSize())
                { innerPadding ->
                    DiscoverScreen(
                        modifier = Modifier.padding(innerPadding),
                        screenState = DiscoverScreenState()
                    )
                }
            }
        }
    }

}
