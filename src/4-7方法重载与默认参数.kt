class TestPerson{

    var isHungrey:Boolean = false

    constructor()

    constructor(isHungrey: Boolean) {
        this.isHungrey = isHungrey
    }


    //由于在Kotlin中有默认参数的概念，所以尽量不要用方法重载
    @JvmOverloads
    fun eat(food: Food = Food(), water: Water = Water()){

    }
}

class Food

class Water