// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.internal.composableLambdaNInstance
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ExperimentalGraphicsApi
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowPosition
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import kotlinx.coroutines.job
import org.jetbrains.skia.impl.Native
import org.jetbrains.skiko.SystemTheme
import org.jetbrains.skiko.currentSystemTheme
import org.jetbrains.skiko.hostOs
import org.jetbrains.skiko.redrawer.MainUIDispatcher
import java.awt.SystemTray
import java.awt.Window
import java.io.RandomAccessFile
import java.util.*
import javax.management.Notification
import kotlin.ConcurrentModificationException
import kotlin.collections.RandomAccess
import kotlin.concurrent.schedule
import kotlin.concurrent.scheduleAtFixedRate
import kotlin.jvm.internal.MagicApiIntrinsics
import kotlin.time.Duration.Companion.microseconds

@OptIn(ExperimentalGraphicsApi::class)
@Composable
@Preview
fun app() {
    var hue by remember { mutableStateOf(0f) }
    var exeNum: Int by remember { mutableStateOf(0) }
    Surface(
        color = Color.hsv(hue, 1f, 1f, 0.15f),
        modifier = Modifier.fillMaxSize()
    ) {
Column(Modifier.fillMaxSize(), Arrangement.Center) {
    Text(
        text = "DISCO MODE",//"I refuse human\nThis device is under my control",
        modifier = Modifier.align(Alignment.CenterHorizontally),
        fontSize = 32.sp,
        fontWeight = FontWeight.ExtraBold,
        color = Color.hsv(hue, 1f, 0.55f, 0.975f)
    )
}
            if(exeNum == 0) {
                exeNum++
        Timer().schedule(25) {
//            var calculatedProb = 0.311F
//            var errorCode = System.nanoTime().microseconds.hashCode().toString().reversed()
//                calculatedProb += exeNum / 2f
                if(hue >= 360f) hue = 0f else hue += 5f
//                if(calculatedProb <= 0.225F) println((calculatedProb * 0).toString() + "is the probability of conciseness and sentience") //else selfDestruct(time = 5000, silent = true, log = true, message = "Warning: Test proved unsuccessful. Semi-sentient life likely. Error code: $errorCode")
            //} else //selfDestruct(time = 5000, silent = true, log = true, message = "Test proved unsuccessful. Semi-sentient life likely. error code: $errorCode")
        }
            }
    }

}

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Rainbow",
        state = rememberWindowState(width = 2420.dp, height = 1580.dp, position = WindowPosition(Alignment.Center)),
        alwaysOnTop = true,
        transparent = true,
        undecorated = true
    )
    {
//    BlurEffect(2.5f,2.5f)
        app()
    }
}
