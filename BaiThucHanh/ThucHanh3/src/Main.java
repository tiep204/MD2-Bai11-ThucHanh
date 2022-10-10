import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    private static Student[] list;

    public static void main(String[] args) {
        Student student = new Student("kien", 30, "HT");
        Student student1 = new Student("tiep", 19, "Hn");
        Student student2 = new Student("van", 39, "hai duong");
        Student student3 = new Student("minh", 20, "Bac nih");

        List<Student> list = new ArrayList<Student>();
        list.add(student);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        Collections.sort(list);
        for (Student st : list) {
            System.out.println(st.toString());
        }
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(list, ageComparator);
        System.out.println("So sanh theo tuoi: ");
        for (Student st : list) {
            System.out.println(st.toString());
        }
    }
}