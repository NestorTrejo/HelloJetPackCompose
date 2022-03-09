package com.prueba.hellojetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.prueba.hellojetpackcompose.ui.theme.HelloJetPackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            Text(text = "Hola, Bienvenido a JetPack Compose")
            DatosPersonales(name = "Nestor")
        }
    }
    //se acaba de editar esto
    @Composable
    private fun DatosPersonales(name:String){
        Column(modifier=Modifier.padding(16.dp)) {
            Image(painter = painterResource(id = R.drawable.winword_zyxzdyl1lr), contentDescription = "Avatar Android")
            Text(text = "Mi nombre $name")
            Text(text = "Soy UAEH")
            Text(text = "Elijoser Garza")
            Text(text = "Lic en Ingeneria de Software")
        }
    }
    @Preview
    @Composable
    fun PreviewDatosPersonales(){
        DatosPersonales(name = "Nestor")
    }
}

