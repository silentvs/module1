package module_2

fun main(args: Array<String>) {
    val countriesArray: Array<Array<String>> = Array(3) { Array(4) { "" } }

    countriesArray[0] = arrayOf("Страна", "Россия", "Украина", "Польша")
    countriesArray[1] = arrayOf("Столица", "Москва", "Киев", "Варшава")
    countriesArray[2] = arrayOf("Валюта", "Рубль", "Гривна", "Злотый")

    for (column in 0 until countriesArray[0].size) {
        for (cell in 0 until countriesArray.size) {
            print("${countriesArray[cell][column]}\t\t")
        }
        println()
    }
}