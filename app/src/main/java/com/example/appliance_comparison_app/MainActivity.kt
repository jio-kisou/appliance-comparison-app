package com.example.appliance_comparison_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.appliance_comparison_app.ui.theme.AppliancecomparisonappTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppliancecomparisonappTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting(stringResource(R.string.android))
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Column {
        Text(text = "Hello $name!", color = Color.Red)
        Text(text = "Hello $name!", color = Color.Blue, fontSize = 10.sp)
        Text(text = "Hello $name!", color = Color(0xff77ddbb), fontSize = 30f.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AppliancecomparisonappTheme {
        Greeting("Android")
    }
}