package BOJ

fun main() {
    var n :Int = readLine()!!.toInt()
    n = 1000-n
    val money : Array<Int> = arrayOf(500, 100, 50, 10, 5, 1)
    var answer : Int = 0
    for(i in 0 until 6){
        answer += (n / money[i]).toInt()
        n %= money[i]
    }
    println(answer)
}