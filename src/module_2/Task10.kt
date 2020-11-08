package module_2

fun main(args: Array<String>) {
    var action: Int = 0
    var cities: ArrayList<String> = ArrayList()

    while (action != 4) {
        println("Введите порядковый номер действия: 1. Добавить название города в программу\t" +
                "2.Посмотреть в консоли список всех добавленных городов\t" +
                "3.Посмотреть список добавленных городов без повторений\t" +
                "4.Выход из программы")
        try {
            action = readLine()?.toInt() ?: 0
        } catch (e: NumberFormatException) {
        }
        when (action) {
            1 -> {
                println("Введите название города:")
                cities.add(readLine().toString())
                action = 0
            }
            2 -> {
                println(cities)
                action = 0
            }
            3 -> {
                println(cities.distinct())
                action = 0
            }
            4 -> {
                println("Выход из программы")
            }
            else -> {
                println("Неверный номер действия")
            }
        }
    }
}