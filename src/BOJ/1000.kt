package BOJ

import java.io.BufferedReader as BF
import java.io.InputStreamReader
import java.util.StringTokenizer as ST

fun main(args:Array<String>){
    val br = BF(InputStreamReader(System.`in`))
    val token = ST(br.readLine())
    println(Integer.parseInt(token.nextToken()) + Integer.parseInt(token.nextToken()))
    br.close()
}