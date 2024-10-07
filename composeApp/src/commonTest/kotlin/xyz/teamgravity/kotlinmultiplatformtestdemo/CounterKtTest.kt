package xyz.teamgravity.kotlinmultiplatformtestdemo

import androidx.compose.ui.test.assertTextEquals
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.runComposeUiTest
import kotlin.test.Test

class CounterKtTest {

    @Test
    fun testCounterCountsUp() {
        runComposeUiTest {
            setContent {
                Counter()
            }

            val countT = onNodeWithTag("count_t")
            val incrementB = onNodeWithTag("increment_b")

            countT.assertExists()
            incrementB.assertExists()

            countT.assertTextEquals("0")
            incrementB.performClick()
            countT.assertTextEquals("1")
        }
    }
}