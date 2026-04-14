import java.util.HashMap;

public class EmployeeHashMapDemo {
    public static void main(String[] args) {

        // create HashMap for employee ID and employee name
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

        // add one more employee
        employees.put(106, "Salim");

        // display updated records
        System.out.println("After adding one more employee:");
        System.out.println(employees);
    }
}