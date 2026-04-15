import java.util.HashMap;

public class EmployeeUpdateDemo {
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
        System.out.println("Employee records before update:");
        System.out.println(employees);

        // update one employee name
        employees.put(102, "Sarah");
        System.out.println("After updating employee ID 102:");
        System.out.println(employees);

        // show updated value
        System.out.println("Updated name for ID 102: " + employees.get(102));

        // update another employee
        employees.put(104, "Nora");
        System.out.println("After updating employee ID 104:");
        System.out.println(employees);
    }
}