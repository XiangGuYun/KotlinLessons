fun main(args: Array<String>) {
    val strTest1 = "I Love You!"
    println("扩展函数测试：${strTest1.multiply(10)}")
    val strTest2 = "Me Too!"
    println("扩展函数测试：${strTest2*10}")
    println("扩展属性测试：$strTest1.a")
}

/**
 * 给系统类添加自定义扩展函数
 */
fun String.multiply(num:Int):String{
    var builder = StringBuilder()
    for(i in 0 until num){
        builder.append(this)
    }
    return builder.toString()
}

/**
 * 添加运算符重载
 */
operator fun String.times(num:Int):String{
    var builder = StringBuilder()
    for(i in 0 until num){
        builder.append(this)
    }
    return builder.toString()
}

/**
 * 扩展属性
 */
val String.a:String
get() = "abc"