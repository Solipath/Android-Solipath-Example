package com.solipath.solipathandroidexample

import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.test.platform.app.InstrumentationRegistry
import com.solipath.solipathandroidexample.ui.theme.SolipathAndroidExampleTheme

import org.junit.Test

import org.junit.Assert.*
import org.junit.Rule

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class FizzBuzzInstrumentedTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun input3DisplaysFizz() {
        composeTestRule.setContent {
            SolipathAndroidExampleTheme {
                FizzBuzz()
            }
        }

        with(composeTestRule){
            onNodeWithTag("FizzBuzz Input").performTextInput("3")
            onNodeWithTag("FizzBuzz Output").assertTextEquals("Fizz")
        }
    }
    @Test
    fun emptyStringShouldGiveMessageToInputNumber() {
        composeTestRule.setContent {
            SolipathAndroidExampleTheme {
                FizzBuzz()
            }
        }

        with(composeTestRule){
            onNodeWithTag("FizzBuzz Input").performTextInput("")
            onNodeWithTag("FizzBuzz Output").assertTextEquals("Input A Number")
        }
    }
}