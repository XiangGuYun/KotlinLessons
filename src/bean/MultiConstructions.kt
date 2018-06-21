package bean

class MultiConstructions {

    private var name: Int = 0
    private var age: Int = 0

    constructor() {}

    constructor(name: Int) {
        this.name = name
    }

    constructor(name: Int, age: Int) {
        this.name = name
        this.age = age
    }

    @JvmOverloads
    fun eat(food: Food = Food(), water: Water = Water()){

    }

}

class Food
class Water
