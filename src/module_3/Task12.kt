package module_3

fun main(args: Array<String>) {

    try {
        println("Введите год:")
        val year = readLine().toString().toInt()
        isLeapYear(year)
    } catch (e: NumberFormatException) {
        println("Введено нецифровое значение или не целое число")
    }

}

fun isLeapYear(year: Int) {

    if ((year % 400 == 0) or ((year % 4 == 0) and (year % 100 != 0))) println("Год $year - високосный")
    else println("Год $year - НЕ високосный")
}