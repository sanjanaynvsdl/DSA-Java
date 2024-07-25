public class Student implements Comparable<Student> {
    //refer bits java-collections-3
    // Comparable and comparator both are interfaces
    //this is all about comparable 
    /* comparable will be implemented by class!(we can only have single sorting logic like only for marks or only for attendence)
     * interface : comparable 
     * implemets : compareTo (method)
     */

     /* comparator can be used to implemetn multiple sorting logic
      * 
      */
    String name;
    int roll;
    double psp;
    int cgr;
    int marks;

    public Student(String name,int roll, double psp, int cgr,int marks) {
        this.name=name;
        this.roll=roll;
        this.psp=psp;
        this.cgr=cgr;
        this.marks=marks;
    }

    @Override
    //-ve true comes in first!
    //if both are equal return 0
    //Ascending order of theris marks 
    public int compareTo(Student other) {

        if(this.marks < other.marks) {
            return this.marks-other.marks;
            // reuturn -1;
        }
        else if(this.marks > other.marks) {
            return other.marks-this.marks;
            // return 1;
        }
        return 0;
    }




    
    

    @Override
    //By using this we can print the object 
    public String toString() {
        return "[name :"+this.name+"roll :"+this.roll+"]";
    }

    
}
