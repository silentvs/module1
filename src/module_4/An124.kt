package module_4

class An124(_number: String, _maxFlightRange: Int, _tankCapacity: Int, override val cargoCapacity: Int) : Aircraft(_number, _maxFlightRange, _tankCapacity), Cargo {

    override fun printInformation() {
        super.printInformation()
        println("Вместимость грузов:${cargoCapacity}кг")
    }
}