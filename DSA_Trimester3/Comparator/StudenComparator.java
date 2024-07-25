public class StudenComparator implements Comparator<Student> {
    /*In comparator we can implement multiple sorting logic  */


//In this case we cannot use this key word bcoz we are not in Student class 
    public int compare(Student O1, Student O2) {
        //This means O1 should come before O2 in sorting logic.
        if(O1.marks<O2.marks) {
            return -1;
        }
        else if(O1.marks>O2.marks) {
            return 1;
        }
        return 0;
    }
    //If we want to sort the list of students based ont their attendence we can just 
    //use ATtendence comparator create a class , and object of attendence comparator while sorting just pass the attenComparator!
    //(DOubts)

    //Q) Sort the list of student accr to their marks if marks are equal sort on their attendence
    public int compare(Student O1, Student O2) {
        //This means O1 should come before O2 in sorting logic.
        if(O1.marks<O2.marks) {
            return -1;
        }
        else if(O1.marks>O2.marks) {
            return 1;
        }
        else {
            //compare for attendence
            if(O1.psp>O2.psp) {
                return -1;
            }
            else if(O1.psp>O2.psp) {
                return 1;
            }
           return 0;
        }
    }

     
}
