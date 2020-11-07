package module_1

fun main(args: Array<String>) {

    println("Введите свое имя")
    var userNameInput: String? = readLine()
    var userNameString: String = userNameInput.toString()
    println("Привет, $userNameString!")

}