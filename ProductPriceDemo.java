import java.util.HashMap;

public class ProductPriceDemo {
    public static void main(String[] args) {

        // create HashMap for product name and price
        HashMap<String, Double> products = new HashMap<String, Double>();

        // add product records
        products.put("Laptop", 350.0);
        products.put("Mouse", 8.5);
        products.put("Keyboard", 15.0);
        products.put("Monitor", 120.0);
        products.put("Printer", 75.0);

        // display all records
        System.out.println("Product prices:");
        System.out.println(products);

        // get one product price
        System.out.println("Price of Laptop: " + products.get("Laptop"));

        // check if one product exists
        System.out.println("Does Mouse exist? " + products.containsKey("Mouse"));

        // update one product price
        products.put("Monitor", 130.0);
        System.out.println("After updating Monitor price:");
        System.out.println(products);

        // remove one product
        products.remove("Printer");
        System.out.println("After removing Printer:");
        System.out.println(products);

        // display size
        System.out.println("Total product records left: " + products.size());
    }
}