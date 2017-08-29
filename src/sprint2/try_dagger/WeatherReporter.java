package sprint2.try_dagger;

public class WeatherReporter {

    // можно написать @Inject WeatherService weatherService, если бы не private и final у поля класса
    private final WeatherService weatherService;

    private final LocationManager locationManager;

    // инжектит объекты WeatherService, LocationManager
    // должна быть аннотация @Inject в конструкторах WeatherService и LocationManager
    public WeatherReporter(WeatherService weatherService,
                           LocationManager locationManager) {
        this.weatherService = weatherService;
        this.locationManager = locationManager;
    }

    public void report() {
        String location = locationManager.getCurrentLocation();
        float temperature = weatherService.getTemperature(location);
        System.out.println(temperature);
    }
}
