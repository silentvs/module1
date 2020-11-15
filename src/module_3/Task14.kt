package module_3

fun main(args: Array<String>) {
    employeeInformation("Иванов Иван Иванович", 30, "Бухгалтер", "Холост")
    employeeInformation("Иванов Иван Иванович", "Бухгалтер")
    employeeInformation("Иванов Иван Иванович", 30, "Бухгалтер")
    employeeInformation("Иванов Иван Иванович", "Холост", "Бухгалтер")
    //Через использование именованных аргументов, т.к. при перегрузке функции таким образом - ошибка
    employeeInformation("Иванов Иван Иванович", 30, familyStatus = "Холост", position = "Бухгалтер")

}

fun employeeInformation(fullName: String, age: Int, position: String, familyStatus: String) {
    println("ФИО:$fullName\t\tВозраст:$age\t\tДолжность:$position\t\tСемейное положение:$familyStatus")
}

fun employeeInformation(fullName: String, position: String) {
    println("ФИО:$fullName\t\tДолжность:$position")
}

fun employeeInformation(fullName: String, age: Int, position: String) {
    println("ФИО:$fullName\t\tВозраст:$age\t\tДолжность:$position")
}

fun employeeInformation(fullName: String, familyStatus: String, position: String) {
    println("ФИО:$fullName\t\tСемейное положение:$familyStatus\t\tДолжность:$position")
}
