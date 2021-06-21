// soluçao

import kotlin.random.Random
// import java.util.Random

fun useDifferentRandomClasses(): String {
    return "Kotlin random: " +
            Random.nextInt(2) +
            " Java random:" +
            Random.nextInt(2) +
            "."
}