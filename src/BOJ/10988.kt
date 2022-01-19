package BOJ

fun main() {
    var mySentence = readLine()!!
    val totalLen = mySentence.length
    val len:Int = mySentence.length / 2
    for(i in 0 until len+1){
        if(mySentence[i]!=mySentence[totalLen-1-i]){
            println("0")
            return
        }
    }
    println("1")
}