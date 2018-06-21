package bean

interface DriverCar {
    fun drive()
}

open class KotlinMath{
    companion object {
        @JvmField
        var value:Int = 0

        @JvmStatic//Java调用
        fun sum(a:Double,b:Double): Double {return a+b}
    }
}

