fun main(args: Array<String>) {
    while (true){
        try {
            println("请输入算式")
            var input = readLine()?:break

            var splits = input!!.trim().split(" ")
            var agr1 = splits[0].toDouble()
            var op = splits[1]
            var arg2 = splits[2].toDouble()

            println(message = "$agr1 $op $arg2 = ${Operator.op(agr1,arg2,op)}")

        }catch (e:NumberFormatException){
            println("数字格式错误")
        }catch (e:IndexOutOfBoundsException){
            println("数组越界异常")
        }catch (e:Exception){
            println("未知错误"+e.message)
        }
        println("继续吗[Y]?")
        val cmd = readLine()
        if(cmd==null||cmd.toLowerCase()!="y") break
    }
}

object Operator {
    fun op(a:Double, b:Double, c:String):Double{
        when(c){
            "+" -> return a+b
            "-" -> return a-b
            "x" -> return a*b
            "/" -> return a/b
            "%" -> return a%b
        }
        return -1.0
    }
}
