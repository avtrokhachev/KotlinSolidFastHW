package interfaceSegregationPrinciple.badImplementation


class Eagle(var numberOfFeathers: Int): Bird("Eagle"), NumberOfFeathers {
    var currentLocation: String? = null

    override fun looseFeather() {
        numberOfFeathers = maxOf(0, numberOfFeathers - 1)
    }

    override fun getNumberOfFeathers(): String {
        return numberOfFeathers.toString();
    }

    override fun fly() {
        currentLocation = "in the air"
    }
}