package BOJ

fun main() = with(System.`in`.bufferedReader()) {
    val T = readLine().toInt()
    val A = 300
    val B = 60
    val C = 10
    if(T%C!=0) println("-1")
    else{
        print("${(T/A).toInt()} ")
        print("${(T%A/B).toInt()} ")
        print((T%A%B/C).toInt())
    }

}