import java.util.HashMap;

public class StudentMarksDemo {
    public static void main(String[] args) {

        // create HashMap for student ID and mark
        HashMap<Integer, Integer> students = new HashMap<Integer, Integer>();

        // add student records
        students.put(201, 85);
        students.put(202, 90);
        students.put(203, 78);
        students.put(204, 88);
        students.put(205, 95);

        // display all records
        System.out.println("Student marks:");
        System.out.println(students);

        // get one student mark
        System.out.println("Mark of student 202: " + students.get(202));

        // check if one ID exists
        System.out.println("Does student ID 204 exist? " + students.containsKey(204));

        // update one student mark
        students.put(203, 82);
        System.out.println("After updating mark of student 203:");
        System.out.println(students);

        // remove one student
        students.remove(201);
        System.out.println("After removing student 201:");
        System.out.println(students);

        // display size
        System.out.println("Total student records left: " + students.size());
    }
}