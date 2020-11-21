package module_4

class Aircraft(_number: String, _maxFlightRange: Int, _tankCapacity: Int) {

    var number: String

    init {
        number = _number
    }

    var maxFlightRange: Int

    init {
        maxFlightRange = _maxFlightRange
    }

    var tankCapacity: Int

    init {
        tankCapacity = _tankCapacity
    }

    val fuelConsumption: Double
        get() = tankCapacity / (maxFlightRange / 100.0)

}