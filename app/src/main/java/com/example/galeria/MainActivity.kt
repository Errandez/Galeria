package com.example.galeria

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.galeria.ui.theme.GaleriaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GaleriaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                ) {
                    Galeria()
                }
            }
        }
    }
}

@Composable
fun Galeria() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row() {
            val image = painterResource(R.drawable.cuadro1)
            Image(painter = image,
                contentDescription = null,
                Modifier
                    .height(40.dp)
                    .width(40.dp)
                )
        }
        Row(
        modifier = Modifier.padding(10.dp)
        ) {
            Text(
                text = stringResource(R.string.nombreArt),
                modifier = Modifier.padding(top = 10.dp)
            )
        }
        Row(
            modifier = Modifier.padding(10.dp)
        ) {
            Text(
                text = stringResource(R.string.anio),
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    GaleriaTheme {
        Galeria()
    }
}