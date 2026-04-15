import java.util.HashMap ;
public class EmployeeClearDemo {
    public static void main(String[] args){
        // creating the hashmaps
        HashMap<Integer, String> employees = new HashMap<Integer, String>();
        // add employee records
        employees.put(101, "Ali");
        employees.put(102, "Sara");
        employees.put(103, "Omar");
        employees.put(104, "Noor");
        employees.put(105, "Maha");

        // display all records
        System.out.println("Employee records before clearing:");
        System.out.println(employees);

        // display size before clearing
        System.out.println("Size before clearing: " + employees.size());

        // clear all records
        employees.clear();

        // display after clearing
        System.out.println("Employee records after clearing:");
        System.out.println(employees);

        // display size after clearing
        System.out.println("Size after clearing: " + employees.size());

        // message
        System.out.println("All employee records have been removed.");
    }
}
