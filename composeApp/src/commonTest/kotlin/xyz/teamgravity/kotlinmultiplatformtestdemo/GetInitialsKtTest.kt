package xyz.teamgravity.kotlinmultiplatformtestdemo

import assertk.assertThat
import assertk.assertions.isEqualTo
import kotlin.test.Test

class GetInitialsKtTest {

    @Test
    fun testGetInitials() {
        val actual = "Heaven yeah  "
        val expected = "HY"

        assertThat(getInitials(actual)).isEqualTo(expected)
    }
}