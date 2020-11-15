package module_3

fun main(args: Array<String>) {

    val strArray: Array<String> = arrayOf("Один", "Два", "Четыре", "Три")

    val printStrArr = { strings: Array<String> -> for (str in strings) println(str) }

    printStrArr(strArray)
}