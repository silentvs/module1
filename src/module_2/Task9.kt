package module_2

fun main(args: Array<String>) {
    val countriesArray: Array<Array<String>> = Array(4) { Array(3) { "" } }

    countriesArray[0] = arrayOf("Страна", "Столица", "Валюта")
    countriesArray[1] = arrayOf("Россия", "Москва", "Рубль")
    countriesArray[2] = arrayOf("Украина", "Киев", "Гривна")
    countriesArray[3] = arrayOf("Польша", "Варшава", "Злотый")

    for (column in countriesArray) {
        for (cell in column) {
            print("$cell\t\t")
        }
        println()
    }
}