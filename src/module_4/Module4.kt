package module_4

fun main(args: Array<String>) {
    var action: Int = 0
    val aircrafts: ArrayList<Aircraft> = ArrayList()

    aircrafts.add(Boeing747("QW-qwer", 5000, 600, 500))
    aircrafts.add(E_12("E12-fare", 500, 10))
    aircrafts.add(An124("CA-OR12", 7500, 5000, 120000))
    aircrafts.add(Boeing747("QW-serv", 5000, 600, 350))

    while (action != 4) {
        println("\n\nВведите порядковый номер действия:\n1.Вывести информацию о всех самолетах авиакомпании\t" +
                "2.Вывести информацию о грузовых самолетах авиакомпании\t" +
                "3.Вывести информацию о пассажирских самолетах авиакомпании\t" +
                "4.Выход из программы")
        try {
            action = readLine()?.toInt() ?: 0
        } catch (e: NumberFormatException) {
        }
        when (action) {
            1 -> {
                println("Самолеты авиакомпании:")
                for (n in 0 until aircrafts.size) {
                    aircrafts[n].printInformation()
                }
                action = 0
            }
            2 -> {
                println("Грузовые самолеты авиакомпании:")
                for (n in 0 until aircrafts.size) {
                    if (aircrafts[n] is Cargo) aircrafts[n].printInformation()
                }
                action = 0
            }
            3 -> {
                println("Пассажирские самолеты авиакомпании:")
                for (n in 0 until aircrafts.size) {
                    if (aircrafts[n] is Passenger) aircrafts[n].printInformation()
                }
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