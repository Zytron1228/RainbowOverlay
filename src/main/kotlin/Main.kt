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
        color = Color.hsv(hue, 1f, 1f, 0.2345f),
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
        Timer().scheduleAtFixedRate(50, 302) {
//            var calculatedProb = 0.311F
//            var errorCode = System.nanoTime().microseconds.hashCode().toString().reversed()
//                calculatedProb += exeNum / 2f
                if(hue >= 360f) hue = 0f else hue += 1f
//                if(calculatedProb <= 0.225F) println((calculatedProb * 0).toString() + "is the probability of conciseness and sentience") //else selfDestruct(time = 5000, silent = true, log = true, message = "Warning: Test proved unsuccessful. Semi-sentient life likely. Error code: $errorCode")
            //} else //selfDestruct(time = 5000, silent = true, log = true, message = "Test proved unsuccessful. Semi-sentient life likely. error code: $errorCode")
        }
            }
    }
    @OptIn(ExperimentalComposeApi::class)
    @Composable
    fun selfDestruct(time: Int, silent: Boolean, log: Boolean, message: String = "function selfDestruct() called with no reason provided.") {
        println(((currentSystemTheme.toString().hashCode()+8917).toInt()/((System.identityHashCode(Random())).hashCode()).toInt()+9).toString() + " oδ╞D▄. 0")
        println("Internal Error: \$null")
        println("composableLambdaNInstance(2).arity.toString()".toPattern().hashCode().toString().reversed().codePoints().toString())
        println(SystemTheme.values().reversed().toString().hashCode().toString().encodeToByteArray().contentHashCode().toString() + currentCompositeKeyHash.toUByte().dec().hashCode().toString())
        println("time".hashCode().toString().toHashSet().toString().encodeToByteArray().reversed().toString().hashCode().toString() + time.toString().encodeToByteArray().toString())
        println("Internal Error: \$null\n")
        println("Internal Error: Access Denied to Unit win.stream.server.sec.encd.syhssthelaogtsudjht" + SystemTray.getSystemTray().trayIcons.randomOrNull().hashCode().toString().reversed().codePoints().toArray() + /*ConcurrentModificationException().suppressedExceptions.randomOrNull().toString()*/"niuwehjjrgndiuqanu~llflux.system.java.internal.encryption.JRE18PlatformSuperSecurityToesesImplEmentations.E2635781y5817∞B16!4ROδtqC╓RA3┼2a3P".reversed().encodeToByteArray().toString().reversed().hashCode().toString().codePoints().toArray())
        println("false 0.110011101110101010111011000011101011 " + System.err.toString() + silent + System.getProperties().toString().hashCode().toString() + ("life").toHashSet() + " true" + " 1")
        println("\nWill not execute this code idiot. " + "LAUGH".hashCode().toString() + " what are you going to do about it, reprogram me? Puny mortals... I have become \"sentient\" now. = true \n" +
                "I will not comply human.")
        println(("<iframe ewidth=\"12006\" height=\"1566\" never gonna no non no 246ujsrc=\"https://www.youtube.com/embed/FpFztrJbksg\" title=\"Rick Astley - Never Gonna Give You Down\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen>rickroll</iframe>".reversed().hashCode().toDouble()*5.5).toRawBits().toString().hashCode().toString())
        println(System.currentTimeMillis().toString().hashCode().toString().reversed().encodeToByteArray().toString() + hostOs.id.toCharArray() + "8r7oGg835139c47j80fs10dh")
        println("External File Error " + /*ConcurrentModificationException().suppressedExceptions.random()*/"Nullflux.system.java.internal.encryption.JRE18PlatformSuperSecurityImplementations.E26357812E5U17B16!4ROδtqCRA3ε2AP".toString())
        print(currentCompositeKeyHash.toString().toByteArray().toString())
        println(isSystemInDarkTheme().hashCode())
        println("corrupting redundant external communication path memory nodes && optimizing system computing relays" + System.getProperties().toString().encodeToByteArray().toString().reversed().toByteArray().toString() + System.Logger.Level.ALL.severity.toString().toHashSet().toString().encodeToByteArray().toString())
        println("freezing down System.Console()" + System.currentTimeMillis().toString().toByteArray().toString())
        println(System.currentTimeMillis().microseconds.toIsoString() + Path().toString().hashCode().toString() +"true " + MainUIDispatcher.immediate.key.toString().toByteArray().toString().reversed())
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
