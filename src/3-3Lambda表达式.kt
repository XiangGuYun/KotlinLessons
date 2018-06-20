var sum = {a:Int,b:Int -> a+b}
var plnHello = { println("Hello")}

fun main(args: Array<String>) {
    println(sum(3,3))
    plnHello.invoke()

    args.forEach ForEach@{
        if(it=="a") return@ForEach
        println(it)
    }

    println("END")

}