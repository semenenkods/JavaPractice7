package guru.qa;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetPractice {
    public static void main(String[] args) {
        Set<String> student = new HashSet<>();
        student.add("Student 1");
        student.add("Student 2");
        student.add("Student 3");
        student.add("Student 4");
        student.add("Student 5");
        System.out.println(student);
        System.out.println(student.size());

        student.remove("Student 5");
        if (student.contains("Student 5")) {
            System.out.println("Student 5" + " was found");
        } else {
            System.out.println("Student 5" + " was not found");
        }
        System.out.println(student.size());

        Iterator<String> iterator = student.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

}
}
