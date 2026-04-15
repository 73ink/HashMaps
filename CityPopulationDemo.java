import java.util.HashMap;

public class CityPopulationDemo {
    public static void main(String[] args) {

        // create HashMap for city and population
        HashMap<String, Integer> cities = new HashMap<String, Integer>();

        // add city-population records
        cities.put("Muscat", 1500000);
        cities.put("Dubai", 3300000);
        cities.put("Doha", 2400000);
        cities.put("Manama", 1600000);
        cities.put("Riyadh", 7000000);

        // display all records
        System.out.println("City populations:");
        System.out.println(cities);

        // get population of one city
        System.out.println("Population of Muscat: " + cities.get("Muscat"));

        // check if a city exists
        System.out.println("Does Dubai exist? " + cities.containsKey("Dubai"));

        // check non-existing city
        System.out.println("Does Salalah exist? " + cities.containsKey("Salalah"));

        // update population of one city
        cities.put("Doha", 2500000);
        System.out.println("After updating Doha population:");
        System.out.println(cities);

        // remove one city
        cities.remove("Manama");
        System.out.println("After removing Manama:");
        System.out.println(cities);

        // display total number of records
        System.out.println("Total cities left: " + cities.size());
    }
}