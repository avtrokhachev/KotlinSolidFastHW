package openClosedPrinciple.badImplementation

class GreetingFromFormality(private val formality: String, private val greeting: String) {
    fun areFormalityEquals(input_formality: String): Boolean {
        return input_formality.equals(formality)
    }

    fun getGreeting(): String {
        return greeting;
    }
}