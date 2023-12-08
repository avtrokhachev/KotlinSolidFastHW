package interfaceSegregationPrinciple.badImplementation


open class Bird(private val name: String) {
    open fun fly() {
        println("Bird ${name} can't fly")
    }
}