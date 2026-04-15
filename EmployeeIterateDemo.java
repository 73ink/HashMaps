// i chose this because it will import all the files in util
import java.util.*;

public class EmployeeIterateDemo {
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
        System.out.println("Full employee map:");
        System.out.println(employees);

        // iterate through records
        System.out.println("Employee records one by one:");
        for (Map.Entry<Integer, String> entry : employees.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        // add one more employee
        employees.put(106, "Salim");

        // iterate again
        System.out.println("After adding one more employee:");
        for (Map.Entry<Integer, String> entry : employees.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}