package sprint2.try_dagger;

import dagger.Component;

@Component
public interface AppComponent {

    WeatherReporter getWeatherReporter();
}
