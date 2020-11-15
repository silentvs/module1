package module_3

fun main(args: Array<String>) {

    println("Количество сотрудников: ${employeesCount("Иванов", "Петров", "Сидоров")}")
    println("Количество сотрудников: ${employeesCount()}")
    println("Количество сотрудников: ${employeesCount("Иванов", "Петров")}")
    println("Количество сотрудников: ${
        employeesCount("Иванов", "Петров", "Сидоров", "Абрамов",
                "Лукашов", "Северянов", "Поляков")
    }")

}

fun employeesCount(vararg employeesNames: String): Int {
    return employeesNames.size
}