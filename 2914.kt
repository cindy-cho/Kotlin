import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>){
    val inLines = BufferedReader(InputStreamReader(System.`in`))
    val (A, L) = inLines.readLine().split(' ').map { it.toInt()}
    println(A * (L - 1) + 1)
}
