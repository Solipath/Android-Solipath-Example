package com.solipath.solipathandroidexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import com.solipath.solipathandroidexample.ui.theme.SolipathAndroidExampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SolipathAndroidExampleTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    FizzBuzz()
                }
            }
        }
    }
}

@Composable
fun FizzBuzz() {
    var fizzBuzzInput by remember {mutableStateOf("")}

    TextField(
        value = fizzBuzzInput,
        modifier = Modifier.testTag("FizzBuzz Input"),
        onValueChange = {fizzBuzzInput = it},
        keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number),
        label = {Text("FizzBuzz Input")},

    )

    Text(
        text=fizzBuzzOutputText(fizzBuzzInput),
        modifier= Modifier.testTag("FizzBuzz Output")
    )
}

fun fizzBuzzOutputText(fizzBuzzInput: String): String {
    val fizzBuzzNumber = fizzBuzzInput.toIntOrNull()
    return if(fizzBuzzNumber == null){
        "Input A Number"
    } else {
        FizzBuzzLogic.doFizzBuzz(fizzBuzzNumber)
    }
}
