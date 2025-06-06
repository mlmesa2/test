package com.daviddev.passwordmanager

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.daviddev.passwordmanager.viewmodels.AddAccountViewModel
import com.daviddev.passwordmanager.ui.theme.PasswordManagerTheme
import dagger.hilt.android.AndroidEntryPoint
import java.time.LocalDateTime

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("Seguimiento","MainActivity creada." )
        val addVM : AddAccountViewModel by viewModels( )
        Log.i("Seguimiento","AddAccountViewModel creado." )
        enableEdgeToEdge()
        setContent {
            PasswordManagerTheme{
                val pairList = listOf(Pair("lolo", "123"))
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    com.daviddev.passwordmanager.views.AddDataView();
                    //com.daviddev.passwordmanager.Views.test2()
                    Log.i("Seguimiento","Main activity dentro del scaffold" )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PasswordManagerTheme {
        Greeting("Android")
    }
}

val saveAccount: (String, String, String, LocalDateTime, LocalDateTime) -> Unit = { 
    val1, val2, val3, C, E -> 
    // Implementation goes here
}
