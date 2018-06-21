import bean.DriverCar

//抽象类默认是open的
abstract class Person(age:Int){
    var age:Int = age

    open fun work() {}
    abstract fun eat()
}

class MN(age: Int):Person(age){
    override fun eat() {

    }

    override fun work() {
        super.work()
        println("做软件 $age")
    }
}

class Doctor(age: Int):Person(age){
    override fun eat() {

    }

    override fun work() {
        super.work()
        println("看病 $age")
    }
}

class Manager:DriverCar, Writer{
    override fun write() {
    }

    override fun drive() {
    }
}

class SeniorManager(val driverCar: DriverCar, val writer: Writer):
        DriverCar by driverCar,
        Writer by writer

class CarDriver:DriverCar{
    override fun drive() {
        println("开车...")
    }
}

class PPTWriter:Writer{
    override fun write() {
        println("写PPT...")
    }
}

interface DriverCar{
    fun drive()
}

interface Writer{
    fun write()
}

fun main(args: Array<String>) {
    val person = MN(12)
    person.work()

    val person2 = Doctor(13)
    person2.work()

    var manager = SeniorManager(CarDriver(),PPTWriter())
    manager.drive()
    manager.write()
}