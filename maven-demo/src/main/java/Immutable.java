import java.util.HashMap;
import java.util.Map;

public class Immutable {

    public static void main(String[] args) {
        String a = "";
        String b = a;
        a += "test";
        System.out.println(b);

        String name = "markffaa";
        String newName = name.replace("ffaa", "----");
        System.out.println(name);
        System.out.println(newName);

        Map<String,Integer> testMap = new HashMap<>();
        Location location = new Location(testMap);
        testMap.put("outside class",1);
        System.out.println(location.getLocations().keySet());
        Map<String,Integer> getTestMap = location.getLocations();
        getTestMap.put("outside class again",2);
        System.out.println(location.getLocations().keySet());

        System.out.println("-----");

        Map<String,Integer> testMap2 = new HashMap<>();
        LocationImmutuable locationImmutuable = new LocationImmutuable(testMap2);
        testMap2.put("outside class",1);
        System.out.println(locationImmutuable.getLocations().keySet());
        Map<String,Integer> getTestMapIm = locationImmutuable.getLocations();
        getTestMapIm.put("outside class again",2);
        System.out.println(locationImmutuable.getLocations().keySet());



    }
}


