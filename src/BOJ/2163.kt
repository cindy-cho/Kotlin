package BOJ


fun main() = with(System.`in`.bufferedReader()) {
    val (N, M) = readLine()!!.split(' ').map { it.toInt() }
    println((N-1)+N*(M-1))
}
