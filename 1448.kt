import java.io.BufferedReader as br
import java.io.BufferedWriter as bw
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

//val br = BufferedReader(InputStreamReader(System.`in`))
//val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main(){
    val n = br.readLine().toInt()
    val arr = Array(n) { br.readLine().toInt() }.sortedArrayDescending()

    var flg = false
    for (i in 0..n-3) {
        if (arr[i] < arr[i + 1] + arr[i + 2]) {
            bw.write((arr[i] + arr[i + 1] + arr[i + 2]).toString())
            flg = true
            break
        }
    }
    if (!flg) bw.write("-1")
    bw.close()
}

//fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
//    val n = readLine().toInt()
//    val arr = ArrayList<IntArray>()
//
//    for(i in 0 until n){
//        arr.add(readLine().split(" ").map { it.toInt() }.toIntArray())
//    }
//}
