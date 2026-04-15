import java.util.HashMap;

public class EmployeeCompareUpdateDemo {
    public static void main(String[] args) {

        // create HashMap
        HashMap<Integer, String> employees = new HashMap<Integer, String>();

        // add employee records
        employees.put(101, "Ali");
        employees.put(102, "Sara");
        employees.put(103, "Omar");
        employees.put(104, "Noor");
        employees.put(105, "Maha");

        // display all records
        System.out.println("Employee records before updates:");
        System.out.println(employees);

        // get current value for one key
        System.out.println("Current name for ID 102: " + employees.get(102));

        // update value
        employees.put(102, "Sarah");

        // display updated value
        System.out.println("Updated name for ID 102: " + employees.get(102));

        // repeat for another key
        System.out.println("Current name for ID 104: " + employees.get(104));
        employees.put(104, "Nora");
        System.out.println("Updated name for ID 104: " + employees.get(104));

        // display full map after updates
        System.out.println("Employee records after updates:");
        System.out.println(employees);
    }
}