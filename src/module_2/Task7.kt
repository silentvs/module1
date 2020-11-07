package module_2

fun main(args: Array<String>) {
    var mark: Int = 0
    println("Тест по Географии. Необходимо ввести порядковый номер правильного ответа.")
    println("В какой стране находится город Цинциннати? : 1.Италия 2.Испания 3.США")
    var qInput: String? = readLine()
    var qStr: String = qInput.toString()
    if (qStr == "3") mark++

    println("Какая пустыня расположена в южном полушарии? : 1.Сахара 2.Атакама 3.Гоби")
    qInput = readLine()
    qStr = qInput.toString()
    if (qStr == "2") mark++

    println("Какой остров самый большой в мире? : 1.Гренландия 2.Новая Гвинея 3.Мадагаскар")
    qInput = readLine()
    qStr = qInput.toString()
    if (qStr == "1") mark++

    println("На территории какого современного государства находятся развалины древнего города Карфаген?" +
            " : 1.Тунис 2.Египет 3.Сирия")
    qInput = readLine()
    qStr = qInput.toString()
    if (qStr == "1") mark++

    println("Что такое Титикака?: 1.Пролив 2.Озеро 3.Водопад")
    qInput = readLine()
    qStr = qInput.toString()
    if (qStr == "2") {
        mark++
    }

    when (mark) {
        0 -> println("У Вас отсутствуют знания по географии.")
        1 -> println("Довольно скудные знания по географии")
        2 -> println("Ваша оценка чуть ниже удовлетворительной")
        3 -> println("Ваши знания по географии можно оценить как удовлетворительные")
        4 -> println("У Вас твердая четверка по географии")
        5 -> println("Вы знаете географию на отлично")
    }
}