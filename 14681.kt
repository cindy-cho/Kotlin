import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>){
    val inLines = BufferedReader(InputStreamReader(System.`in`))
    val x = inLines.readLine().toInt()
    val y = inLines.readLine().toInt()
    if( x > 0 && y > 0 ) println("1")
    else if( x < 0 && y > 0 ) println("2")
    else if( x < 0 && y < 0 ) println("3")
    else if( x > 0 && y < 0 ) println("4")
}
