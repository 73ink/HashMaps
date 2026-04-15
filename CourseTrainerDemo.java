import java.util.HashMap;

public class CourseTrainerDemo {
    public static void main(String[] args) {

        // create HashMap for course and trainer
        HashMap<String, String> courses = new HashMap<String, String>();

        // add course-trainer records
        courses.put("Java", "Ahmed");
        courses.put("Python", "Sara");
        courses.put("Database", "Omar");
        courses.put("Networking", "Noor");
        courses.put("Web Design", "Maha");

        // display all records
        System.out.println("Course trainers:");
        System.out.println(courses);

        // get trainer of one course
        System.out.println("Trainer of Java: " + courses.get("Java"));

        // check existing course
        System.out.println("Does Python exist? " + courses.containsKey("Python"));

        // check non-existing course
        System.out.println("Does AI exist? " + courses.containsKey("AI"));

        // update one trainer
        courses.put("Database", "Salim");
        System.out.println("After updating Database trainer:");
        System.out.println(courses);

        // remove one course
        courses.remove("Networking");
        System.out.println("After removing Networking:");
        System.out.println(courses);

        // display size
        System.out.println("Total records left: " + courses.size());
    }
}