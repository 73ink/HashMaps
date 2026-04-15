import java.util.HashMap;

public class CountryCapitalDemo {
    public static void main(String[] args) {

        // create HashMap for country and capital
        HashMap<String, String> countries = new HashMap<String, String>();

        // add country-capital records
        countries.put("Oman", "Muscat");
        countries.put("UAE", "Abu Dhabi");
        countries.put("Qatar", "Doha");
        countries.put("Bahrain", "Manama");
        countries.put("Saudi Arabia", "Riyadh");

        // display all records
        System.out.println("Country capitals:");
        System.out.println(countries);

        // get capital of one country
        System.out.println("Capital of Oman: " + countries.get("Oman"));

        // check if one country exists
        System.out.println("Does Qatar exist? " + countries.containsKey("Qatar"));

        // update one capital
        countries.put("UAE", "Abu Dhabi City");
        System.out.println("After updating UAE capital:");
        System.out.println(countries);

        // remove one record
        countries.remove("Bahrain");
        System.out.println("After removing Bahrain:");
        System.out.println(countries);

        // display size
        System.out.println("Total records left: " + countries.size());
    }
}