import bean.Child
import bean.Parent

fun main(args: Array<String>) {
    //智能类型转换
    var parent: Parent = Child()
    if (parent is Child) println(parent.name)

    var string:String? = "Hello"
    if(string is String) println(string.length)

    //此例会抛出类型转换异常
//    var parent1: Parent = Parent()
//    var child:Child? = parent1 as Child
    //此例不会抛出异常而是返回null
    var parent1: Parent = Parent()
    var child:Child? = parent1 as? Child//安全类型转换
    println(child)

}
