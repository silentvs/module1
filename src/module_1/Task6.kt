package module_1

fun main(args: Array<String>) {

    try {
        println("Введите первое число - a:")
        var aInput: String? = readLine()
        var aFloat: Float = aInput.toString().replace(',', '.').toFloat()
        println("Введите второе число - b:")
        var bInput: String? = readLine()
        var bFloat: Float = bInput.toString().replace(',', '.').toFloat()
        var higher: Boolean = aFloat > bFloat
        println("Число a больше b: $higher")
    } catch (e: NumberFormatException) {
        println("Введено не число")
    }
}