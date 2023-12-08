package dependencyInversionPrinciple.badImplementation

class Emailer() : GenerateWeatherAlert{
    override fun generateWeatherAlert(weatherConditions: String): String {
        return "Email: It is $weatherConditions"
    }
}