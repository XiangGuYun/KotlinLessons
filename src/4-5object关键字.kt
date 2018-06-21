fun main(args: Array<String>) {
    val a = minOf(1,2)
    println(KotlinMath.sum(1.0,2.0))
}

open class KotlinMath{
    companion object {
        @JvmStatic//Java调用
        fun sum(a:Double,b:Double): Double {return a+b}
    }
}