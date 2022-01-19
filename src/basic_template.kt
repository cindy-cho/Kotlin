
fun smain() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    println(n)
}


fun main() {
    var (n, m) = readLine()!!.split(' ').map { it.toInt() }
    println("${n * m - 1}")
}