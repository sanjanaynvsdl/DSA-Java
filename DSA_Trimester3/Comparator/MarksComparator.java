import java.util.*;
public class MarksComparator implements Comparator<Student> {


    @Override
    public int compare(Student O1, Student O2) {
        // if(O1.marks<O2.marks) {
        //     return -1;
        // }
        // else if(O1.marks>O2.marks) {
        //     return 1;
        // }
        // else {
        //     return 0;
        // }
        //Also I can simply write 
        return O1.marks-O2.marks;
        //if it is -ve O1 in ascending
        //if it is +v2 O2 comes first
    }
    
}
