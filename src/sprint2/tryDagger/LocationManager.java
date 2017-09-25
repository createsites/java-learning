package sprint2.tryDagger;

import javax.inject.Inject;


public class LocationManager {

    @Inject
    public LocationManager() {}

    String getCurrentLocation() {
        return "Yurga";
    }
}
