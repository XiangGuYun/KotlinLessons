fun main(args: Array<String>) {
    var range:IntRange = 0..1024 //[0,0124]
    var range1:IntRange = 0 until 1024 //[0,0123]
    var emptyRange = 0..-1
    println("是否为空："+emptyRange.isEmpty())
    println("是否包含："+range.contains(500))
    println("是否包含："+(500 in range))
    //遍历
    for (i in range){
        if(i != range.last)
            print("$i,")
        else
            println("$i.")
    }


    println("start is ${range.start}," +
            "last is ${range.last}," +
            "first is ${range.first}," +
            "step is ${range.step}," +
            "endInclusive is ${range.endInclusive}.")
}