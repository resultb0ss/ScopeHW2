fun main() {

    val moscow = City("Москва")
    moscow.setPopulation(1000000)
    println("${moscow.name} с населением ${moscow.population}")
}

data class City(var name: String, var population: Int = 0){
    fun setPopulation(_population: Int): City = apply { population = _population }
}