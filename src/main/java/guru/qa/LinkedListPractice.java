package guru.qa;
import java.util.LinkedList;
import java.util.List;

public class LinkedListPractice {
    public static void main(String[] args){
        LinkedList<StudentList> list = new LinkedList<>();
        StudentList student1 = new StudentList("First Student");
        StudentList student2 = new StudentList("Second Student");
        StudentList student3 = new StudentList("Third Student");
        StudentList student4 = new StudentList("Forth Student");
        StudentList student5 = new StudentList("Fifth Student");
        StudentList student6 = new StudentList("Sixth student");

        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.addFirst(student5);
        list.addLast(student6);

        int i = 0;
        do {
            System.out.println(list.toArray()[i]);
            i++;
        } while (i < list.size());
        }


    }

