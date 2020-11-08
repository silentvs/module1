package module_2

fun main(args: Array<String>) {
    var action: Int = 0
    var workPlaces: MutableMap<Int, String> = mutableMapOf(1 to "Иванов Иван Иванович", 2 to "Петров Петр Петрович", 5 to "Алексеев Алексей Алексеевич")

    while (action != 3) {
        println("Введите порядковый номер действия:\n1.Закрепить рабочее место за сотрудником\n" +
                "2.Посмотреть кто занимает рабочее место по номеру места\n" +
                "3.Выход из программы")
        try {
            action = readLine()?.toInt() ?: 0
        } catch (e: NumberFormatException) {
        }
        when (action) {
            1 -> {
                try {
                    println("Введите номер рабочего места:")
                    val placeNumber = readLine().toString().toInt()
                    println("Введите ФИО сотрудника:")
                    val employeeFIO = readLine().toString()
                    if (workPlaces[placeNumber] == null) {
                        workPlaces[placeNumber] = employeeFIO
                    } else {
                        println("Место $placeNumber уже занято")

                    }
                    action = 0
                    continue
                } catch (e: NumberFormatException) {
                    println("Введено нецифровое значение рабочего места")
                    action = 0
                    continue
                }
            }
            2 -> {
                try {
                    println("Введите номер искомого рабочего места:")
                    val placeNumber = readLine().toString().toInt()
                    if (workPlaces[placeNumber] == null) {
                        println("Место $placeNumber не занято сотрудником")
                    } else {
                        println("Место $placeNumber закреплено за сотрудником ${workPlaces[placeNumber]}")

                    }
                    action = 0
                    continue
                } catch (e: NumberFormatException) {
                    println("Введено нецифровое значение рабочего места")
                    action = 0
                    continue
                }
            }
            3 -> {
                println("Выход из программы")
            }
            else -> {
                println("Неверный номер действия")
            }
        }
    }

}