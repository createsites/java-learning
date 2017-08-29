package sprint2.try_dagger;

import javax.inject.Inject;


public class WeatherService {

    @Inject
    public WeatherService() {}

    float getTemperature(String location) {
        if (location == "Yurga") {
            return 17.5f;
        }

        return 0f;
    }
}
