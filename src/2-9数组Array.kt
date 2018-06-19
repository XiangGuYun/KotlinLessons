import bean.射手

var intArr = intArrayOf(1,2,3)
var charArr = charArrayOf('1','a','f')
var strArr = arrayOf("我","是","剑客")
var adcArr = arrayOf(射手("小炮"),射手("寒冰"),射手("大嘴"))

fun main(args: Array<String>) {
    println("数组的长度是${intArr.size}")

    //遍历数组
    for (i in intArr) print("元素$i")
    println("\n")

    //获取数组信息和数组元素赋值
    println("第二个ADC是${adcArr[1].姓名}")
    adcArr[1].姓名 = "花无缺"
    println("第二个ADC是${adcArr[1].姓名}")

    //char数组转字符串
    println(charArr.joinToString("-"))

    //裁剪数组
    println("裁剪结果："+intArr.slice(1..2))

    /*
    使用各种方式来打印HelloWorld
     */
    val text1 = "Hello World"
    var text2 = "Hello World"
    var text3 = text2
    var text4 = charArrayOf('H','e','l','l','0','W','o','r','l','d')
    var text5 = arrayOf('H','e','l','l','0','W','o','r','l','d')
    String(text4)
    text5.joinToString("")
}