package com.example.calculadoraimc

import android.R.attr.onClick
import android.R.attr.text
import android.graphics.pdf.component.PdfPageObjectType.IMAGE
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.input.InputTransformation.Companion.keyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.HorizontalAlignmentLine
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.calculadoraimc.ui.theme.CalculadoraIMCTheme
import org.intellij.lang.annotations.JdkConstants

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CalculadoraIMCTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                   IMCScreen(
                       modifier = Modifier.padding(innerPadding)
                   )
                }
            }
        }
    }
}

@Composable
fun IMCScreen(modifier: Modifier = Modifier) {

    Column(modifier = modifier.fillMaxSize()
    ,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Column(
            modifier = Modifier.fillMaxWidth()
                .height(160.dp)
                .background(color = colorResource(R.color.cor_app)),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {


            Image(
                painter = painterResource(R.drawable.bmi),
                contentDescription = "Bmi",
                modifier = Modifier
                    .size(80.dp)
                    .padding(16.dp)
            )
            Text(
                text = "Calculadora de IMC",
                fontSize = 24.sp,
                color = Color.Black,
                fontWeight = FontWeight.Bold
            )
        }
        //card formulario
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(24.dp)

        ) {

            var altura by remember {
                mutableStateOf(value = "")
            }

            var peso by remember {
                mutableStateOf(value = "")
            }


            Card(
                modifier = modifier
                    .fillMaxWidth()
                    .height(300.dp)
                    .offset(y = (-75).dp),

                colors = CardDefaults.cardColors(
                    containerColor = Color(214, 187, 255, 234)
                ),
                elevation = CardDefaults.cardElevation(8.dp),
                shape = RoundedCornerShape(12.dp),
                border = BorderStroke(0.5.dp, color = Color.Yellow)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),

                    horizontalAlignment = Alignment.CenterHorizontally

                ) {

                    Text(
                        text = "Seus Dados",
                        fontSize = 24.sp,
                        color = Color.White,
                        fontWeight = FontWeight.Bold,

                        )

                    Spacer(modifier = Modifier.height(20.dp))
                    OutlinedTextField(
                        value = altura,

                        onValueChange = { novoValor ->
                            altura = novoValor
                        },
                        shape = RoundedCornerShape(12.dp),
                        //color = Color.Yellow,
                        keyboardOptions = KeyboardOptions(capitalization = KeyboardCapitalization.Characters),
                        placeholder = {
                            Text("Altura")
                        }

                    )
                    Spacer(modifier = Modifier.height(20.dp))
                    OutlinedTextField(
                        value = peso,


                        onValueChange = { novoValor ->
                            altura = novoValor
                        },
                        shape = RoundedCornerShape(12.dp),
                        keyboardOptions = KeyboardOptions(capitalization = KeyboardCapitalization.Characters),
                        placeholder = {
                            Text("Peso")
                        }

                    )
                    Spacer(modifier = Modifier.height(20.dp))
                    Button(
                        onClick = {

                        },
                        modifier = Modifier
                            .width(300.dp)
                            .height(50.dp)
                    ) {
                        Text("Calcular")
                    }

                }

            }

        }
        Card(
            modifier = modifier
                .width(350.dp)
                .height(100.dp)
                .offset(y = (-80).dp),



            colors = CardDefaults.cardColors(
                containerColor = Color( 0, 120, 0)
            ),

            elevation = CardDefaults.cardElevation(8.dp),
            shape = RoundedCornerShape(12.dp),
            border = BorderStroke(0.5.dp, color = Color.Yellow)
        ) {
            Row( modifier = )
            {
                Text(
                    text = "Aqui",
                    fontSize = 24.sp,
                    color = Color.White
                )
                Text(
                    text = "Power",
                    fontSize = 24.sp,
                    color = Color.White
                )

            }
        }

    }
}