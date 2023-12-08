package dependencyInversionPrinciple.badImplementation

class Phone() : GenerateWeatherAlert {
    override fun generateWeatherAlert(weatherConditions: String): String {
        return "Phone: It is $weatherConditions"
    }
}