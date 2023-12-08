package openClosedPrinciple.badImplementation

class EmailGreeting(private var formality: String) {
    private var greetings: List<GreetingFromFormality> = emptyList();

    var greeting: String = ""
        get() {
            for (greeting in greetings) {
                if (greeting.areFormalityEquals(formality)) {
                    return greeting.getGreeting();
                }
            }
            return "Hello"
        }


    fun setFormality(formality: String) {
        this.formality = formality
    }

    fun addGreeting(greeting: GreetingFromFormality) {
        greetings = greetings.plus(greeting);
    }
}