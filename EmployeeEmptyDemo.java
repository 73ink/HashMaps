import java.util.HashMap;

public class EmployeeEmptyDemo {
    public static void main(String[] args) {

        // create HashMap
        HashMap<Integer, String> employees = new HashMap<Integer, String>();

        // check before adding records
        System.out.println("Is the map empty before adding records? " + employees.isEmpty());

        // add employee records
        employees.put(101, "Ali");
        employees.put(102, "Sara");
        employees.put(103, "Omar");
        employees.put(104, "Noor");
        employees.put(105, "Maha");

        // display records
        System.out.println("Employee records:");
        System.out.println(employees);

        // check after adding records
        System.out.println("Is the map empty after adding records? " + employees.isEmpty());

        // clear all records
        employees.clear();

        // display map after clearing
        System.out.println("Employee records after clearing:");
        System.out.println(employees);

        // final check
        System.out.println("Is the map empty after clearing? " + employees.isEmpty());
    }
}