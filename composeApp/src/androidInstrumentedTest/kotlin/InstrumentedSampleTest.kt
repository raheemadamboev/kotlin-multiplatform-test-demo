import android.content.Context
import androidx.test.core.app.ApplicationProvider
import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.Test

class InstrumentedSampleTest {

    @Test
    fun testContext() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val actual = context.packageName
        val expected = "xyz.teamgravity.kotlinmultiplatformtestdemo"

        assertThat(actual).isEqualTo(expected)
    }
}