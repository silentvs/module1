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
        print("Характеристики самолета:\nНомер воздушного судна:$number\tMAX дальность полета:${maxFlightRange}км\t" +
                "Вместимость бака:${tankCapacity}л\tРасход топлива(л) на 100км:$fuelConsumption")
    }

}