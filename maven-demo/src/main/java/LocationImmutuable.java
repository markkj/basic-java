import java.util.HashMap;
import java.util.Map;

public final class LocationImmutuable {
    //final class for not extend this class
    private final Map<String, Integer> locations;

    public LocationImmutuable(Map<String, Integer> locations) {
        this.locations = new HashMap<>(locations);
        this.locations.put("Inside Class", 0);
    }

    public Map<String, Integer> getLocations() {
        return new HashMap<>(locations);
    }


}
