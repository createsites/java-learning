package sprint2.try_dagger;

import javax.inject.Inject;


public class LocationManager {

    @Inject
    public LocationManager() {}

    String getCurrentLocation() {
        return "Yurga";
    }
}
