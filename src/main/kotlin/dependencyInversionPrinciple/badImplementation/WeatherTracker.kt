package dependencyInversionPrinciple.badImplementation

class WeatherTracker (
    private var conditions: String,
    private val phone: GenerateWeatherAlert,
    private val emailer: GenerateWeatherAlert,
) {

    fun setCurrentConditions(weatherDescription: String) {
        this.conditions = weatherDescription
        if (weatherDescription === "rainy") {
            val phone_alert: String = phone.generateWeatherAlert(weatherDescription)
            val emailer_alert: String = emailer.generateWeatherAlert(weatherDescription)
            println(phone_alert)
            println(emailer_alert)
        } else if (weatherDescription === "sunny") {
            val phone_alert: String = phone.generateWeatherAlert(weatherDescription)
            val emailer_alert: String = emailer.generateWeatherAlert(weatherDescription)
            println(phone_alert)
            println(emailer_alert)
        }
    }

}