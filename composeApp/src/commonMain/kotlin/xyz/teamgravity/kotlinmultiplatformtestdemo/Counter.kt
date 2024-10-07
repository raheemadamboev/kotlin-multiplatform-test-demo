package xyz.teamgravity.kotlinmultiplatformtestdemo

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.unit.dp
import kotlinmultiplatformtestdemo.composeapp.generated.resources.Res
import kotlinmultiplatformtestdemo.composeapp.generated.resources.increment
import org.jetbrains.compose.resources.stringResource

@Composable
fun Counter() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(
            space = 10.dp,
            alignment = Alignment.CenterVertically
        ),
        modifier = Modifier.fillMaxSize()
    ) {
        var count by rememberSaveable { mutableIntStateOf(0) }

        Text(
            text = count.toString(),
            modifier = Modifier.testTag("count_t")
        )
        Button(
            onClick = {
                count++
            },
            modifier = Modifier.testTag("increment_b")
        ) {
            Text(
                text = stringResource(Res.string.increment)
            )
        }
    }
}