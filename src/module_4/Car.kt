package module_4

data class Car(val model: String, val color: String, val number: String) {
}

fun main(args: Array<String>) {

    val car1: Car = Car("Mercedes A1", "black", "а150ку77")
    val car2: Car = Car("BMW X3", "blue", "и713вв777")
    val car3: Car = Car("Nissan X-TRAIL", "white", "о000ок05")

    println(car1.toString())
    println(car2.toString())
    println(car3.toString())
}