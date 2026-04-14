import java.util.HashMap;

public class EmployeeRemoveDemo {
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
        System.out.println("Employee records before removing:");
        System.out.println(employees);

        // remove one employee
        employees.remove(103);
        System.out.println("After removing employee ID 103:");
        System.out.println(employees);

        // remove another employee
        employees.remove(105);
        System.out.println("After removing employee ID 105:");
        System.out.println(employees);

        // try removing ID that does not exist
        employees.remove(200);
        System.out.println("After trying to remove employee ID 200:");
        System.out.println(employees);
    }
}