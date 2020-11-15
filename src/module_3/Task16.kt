package module_3

import kotlin.math.sqrt

fun main(args: Array<String>) {

    val numDouble = 16.0

    if (numDouble < 0) {
        println("Арифметический квадратный корень можно получить только из неотрицательного числа")
        return
    }
    println("Корень числа $numDouble равен ${numDouble.sqrt()}")

}

fun Double.sqrt(): Double {
    return sqrt(this)
}