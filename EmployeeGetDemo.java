import java.util.HashMap;

public class EmployeeGetDemo {
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
        System.out.println("Employee records:");
        System.out.println(employees);

        // get employee name using ID
        System.out.println("Employee with ID 102: " + employees.get(102));
        System.out.println("Employee with ID 104: " + employees.get(104));
    }
}