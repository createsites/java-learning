package sprint2.try_dagger;


public class Main {

    public static void main(String[] args) {
        // строит graph зависимости
        AppComponent component = DaggerAppComponent.create();
        WeatherReporter reporter = component.getWeatherReporter();
        reporter.report();
    }
}
