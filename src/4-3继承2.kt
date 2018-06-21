open class A{
    fun x():Int = 1
}

interface B{
    fun x():Int = 2
}

interface C{
    fun x():Int = 3
}

class D(var num:Int = 0):B,C{
    override fun x(): Int {
        return super<B>.x()
    }
}

fun main(args: Array<String>) {
    D(10)
}