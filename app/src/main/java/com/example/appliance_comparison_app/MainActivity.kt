package com.example.appliance_comparison_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
    Text(
        text = name,
        modifier = Modifier
            .size(120.dp, 80.dp)
            .offset(20.dp, 20.dp)
            .background(Color(0xff66cdaa), RoundedCornerShape(20.dp))
            .border(2.dp, Color(0xff2f4f4f), RoundedCornerShape(20.dp))
            .padding(20.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AppliancecomparisonappTheme {
        Greeting("Android")
    }
}