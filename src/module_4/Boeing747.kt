package module_4

class Boeing747(_number: String, _maxFlightRange: Int, _tankCapacity: Int, _passengerCapacity: Int) : Aircraft(_number, _maxFlightRange, _tankCapacity) {

    var passengerCapacity: Int

    init {
        passengerCapacity = _passengerCapacity
    }
}