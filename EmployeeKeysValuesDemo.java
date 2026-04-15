import java.util.HashMap;

public class EmployeeKeysValuesDemo {
    public static void main(String[] args) {

        // create HashMap
        HashMap<Integer, String> employees = new HashMap<Integer, String>();

        // add employee records
        employees.put(101, "Ali");
        employees.put(102, "Sara");
        employees.put(103, "Omar");
        employees.put(104, "Noor");
        employees.put(105, "Maha");

        // display full map
        System.out.println("Employee records:");
        System.out.println(employees);

        // display all keys
        System.out.println("Employee IDs:");
        System.out.println(employees.keySet());

        // display all values
        System.out.println("Employee names:");
        System.out.println(employees.values());

        // add one more employee
        employees.put(106, "Salim");

        // display updated keys and values
        System.out.println("Updated employee IDs:");
        System.out.println(employees.keySet());

        System.out.println("Updated employee names:");
        System.out.println(employees.values());
    }
}