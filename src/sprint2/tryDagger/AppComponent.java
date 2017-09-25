package sprint2.tryDagger;

import dagger.Component;

@Component
public interface AppComponent {

    WeatherReporter getWeatherReporter();
}
