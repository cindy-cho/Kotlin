import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>){
    val inLines = BufferedReader(InputStreamReader(System.`in`))
    val a1 = inLines.readLine().toInt()
    val a2 = inLines.readLine().toInt()
    val a3 = inLines.readLine().toInt()
    val a4 = inLines.readLine().toInt()
    val a5 = inLines.readLine().toInt()
    var sum = 0

    if(a1 > 40) sum+=a1 else sum += 40
    if(a2 > 40) sum+=a2 else sum += 40
    if(a3 > 40) sum+=a3 else sum += 40
    if(a4 > 40) sum+=a4 else sum += 40
    if(a5 > 40) sum+=a5 else sum += 40

    println(sum/5)
}
