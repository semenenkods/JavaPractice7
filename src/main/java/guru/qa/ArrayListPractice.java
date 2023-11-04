package guru.qa;
import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {
    public static void main(String[] args){
        List<StudentList> list = new ArrayList();
        StudentList student1 = new StudentList("First Student");
        StudentList student2 = new StudentList("Second Student");
        StudentList student3 = new StudentList("Third Student");
        StudentList student4 = new StudentList("Forth Student");

        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        System.out.println(list);

        for (StudentList student: list) {

            if (student.getName().equals("Third Student")) {
                list.remove(student);
            }
        }

        System.out.println(list);
        System.out.println(list.size());

        StudentList student = list.get(1);
        System.out.println(student);



    }
}
