class Yard{
    private val house:House = House()
    public val flower:Flower = Flower()
    protected val flower1:Flower = Flower()
    internal  val flower2:Flower = Flower()//与Java不兼容 模块内可见
    //kotlin没有default
}

class Flower {

}

class House {

}
