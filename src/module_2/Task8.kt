package module_2

fun main(args: Array<String>) {
    var depositSum: Float
    val depositMonths: Int
    val depositPercentage: Float
    var depositPlus: Float
    try {
        println("Введите сумму вклада:")
        depositSum = readLine().toString().replace(',', '.').toFloat()
        if (depositSum <= 0) {
            println("Сумма вклада не может быть нулевой или отрицательной")
            return
        }
        println("Введите количество целых месяцев для вклада:")
        depositMonths = readLine().toString().toInt()
        if (depositMonths <= 0) {
            println("Количество месяцев для вклада не может быть нулевым или отрицательным")
            return
        }
        println("Введите ежемесячный процент по вкладу:")
        depositPercentage = readLine().toString().replace(',', '.').toFloat()
        if (depositPercentage <= 0) {
            println("Процент по вкладу не может быть нулевым или отрицательным")
            return
        }
    } catch (e: NumberFormatException) {
        println("Введено не число")
        return
    }

    var i: Int = 1
    while (i <= depositMonths) {
        depositPlus = depositSum / 100 * depositPercentage
        depositSum += depositPlus
        println("В $i месяце:\nВклад увеличился на: $depositPlus\n" +
                "Сумма вклада после начисления процента: $depositSum\n" +
                "-----------------------------------------------------")
        i++
    }

}