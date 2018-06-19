fun main(args: Array<String>):Unit {
    println(sum(1,2))
    println(multiple(1,2))
    println(subtract(1,2))
}

fun sum(a:Int, b:Int):Int{
    return a+b
}

fun multiple(a: Int,b: Int) = a*b

var subtract = fun(a:Int,b:Int) = a-b