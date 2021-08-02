import java.util.Map;

public class Location {

    private Map<String, Integer> locations;

    public Location(Map<String, Integer> locations) {
        this.locations = locations;
        this.locations.put("Inside Class", 0);
    }

    public Map<String, Integer> getLocations() {
        return locations;
    }


}
