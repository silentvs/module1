package module_4

class Boeing747(_number: String, _maxFlightRange: Int, _tankCapacity: Int, override val passengerCapacity: Int) : Aircraft(_number, _maxFlightRange, _tankCapacity), Passenger {

}