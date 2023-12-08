package interfaceSegregationPrinciple.badImplementation


class Penguin(var numberOfFeathers: Int) : Bird("Penguin"), NumberOfFeathers, Swim  {
    var currentLocation: String? = null

    override fun looseFeather() {
        numberOfFeathers = maxOf(0, numberOfFeathers - 1)
    }

    override fun getNumberOfFeathers(): String {
        return numberOfFeathers.toString()
    }

    override fun swim() {
        currentLocation = "in the water"
    }
}