import java.rmi.StubNotFoundException;
import java.util.*;
public class client {
    public static void main(String[] args) {
        List<Student> students =new ArrayList<>();
        Student St1=new Student("Sanjana",21,6.8,70,61);
        Student St2=new Student("Harshini",20,7.0,80,65);
        Student St3=new Student("Kushi",22,6.9,90,55);
        
        MarksComparator marks=new MarksComparator();
        AttendenceComparator att=new AttendenceComparator();
        MarksAttComparator Markatt=new MarksAttComparator();

        // Collections.sort(students, att);
        // Collections.sort(students,Markatt);
        Collections.sort(students,marks);

        for(Student std:students) {
            System.out.println(std.toString());
        }

    }
    
    
}
