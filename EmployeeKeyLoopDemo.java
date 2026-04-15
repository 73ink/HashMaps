import java.util.HashMap;

public class EmployeeKeyLoopDemo {
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

        // loop through keys and display matching values
        System.out.println("Employee records one by one:");
        for (Integer key : employees.keySet()) {
            System.out.println("ID: " + key + ", Name: " + employees.get(key));
        }

        // add one more record
        employees.put(106, "Salim");

        // display updated records
        System.out.println("After adding one more employee:");
        for (Integer key : employees.keySet()) {
            System.out.println("ID: " + key + ", Name: " + employees.get(key));
        }
    }
}