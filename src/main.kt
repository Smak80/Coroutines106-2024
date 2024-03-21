import kotlinx.coroutines.*
import kotlin.random.Random

fun main() = runBlocking{
    val cs = CoroutineScope(Dispatchers.IO)
    async {
        delay(2000)
        println("Привет из async-корутины")
        Random.nextInt(100)
    }
    launch {
        delay(500)
        println("Привет из launch-корутины")
    }
    val res = 0
    println("Привет из main")
    println("Результат: $res")
}