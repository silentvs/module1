package module_4

abstract class Aircraft(_number: String, _maxFlightRange: Int, _tankCapacity: Int) {

    protected var number: String
    protected var maxFlightRange: Int
    protected var tankCapacity: Int

    init {
        number = _number
        maxFlightRange = _maxFlightRange
        tankCapacity = _tankCapacity
    }

    protected val fuelConsumption: Double
        get() = tankCapacity / (maxFlightRange / 100.0)

    open fun printInformation() {
        println("\nХарактеристики самолета:\nНомер воздушного судна:$number\nMAX дальность полета:${maxFlightRange}км\n" +
                "Вместимость бака:${tankCapacity}л\nРасход топлива(л) на 100км:$fuelConsumption")
    }

}