package module_4

class Aircraft {

    var number: String = "G-VBZZ"

    var maxFlightRange: Int = 5000

    var tankCapacity: Int = 600

    val fuelConsumption: Double
        get() = tankCapacity / (maxFlightRange / 100.0)

}