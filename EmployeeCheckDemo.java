import java.util.HashMap;

public class EmployeeCheckDemo {
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

        // check keys
        System.out.println("Does ID 103 exist? " + employees.containsKey(103));
        System.out.println("Does ID 200 exist? " + employees.containsKey(200));

        // check values
        System.out.println("Does name Sara exist? " + employees.containsValue("Sara"));
        System.out.println("Does name Ahmed exist? " + employees.containsValue("Ahmed"));
    }
}