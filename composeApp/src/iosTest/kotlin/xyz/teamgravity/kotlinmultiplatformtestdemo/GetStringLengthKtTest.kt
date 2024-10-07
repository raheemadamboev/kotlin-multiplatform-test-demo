package xyz.teamgravity.kotlinmultiplatformtestdemo

import assertk.assertThat
import assertk.assertions.isEqualTo
import kotlin.test.Test

class GetStringLengthKtTest {

    @Test
    fun testGetStringLength() {
        val actual = "Rich and Blind"
        val expected = 14

        assertThat(getStringLength(actual)).isEqualTo(expected)
    }
}