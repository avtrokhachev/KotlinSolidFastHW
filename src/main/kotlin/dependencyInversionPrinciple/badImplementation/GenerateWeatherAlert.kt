package dependencyInversionPrinciple.badImplementation

interface GenerateWeatherAlert {
    fun generateWeatherAlert(weatherConditions: String): String
}