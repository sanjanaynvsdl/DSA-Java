package Class_Objects;
// import java.util.*;
/*To store different types of data types we use class and objects
 * name
 * email
 * age
 * phone number
 * 
 */


//Class is the blue print of the objects 
class Student{
    String name;
    String email;
    String phNo;
    String parentPhNo;
    int rollNo;
    int hometownPincode;
    String mentorEmail;

    //constructor is the only place where we no need to mention the return type of the output
    //coz it is already written in the class. 
    // itself understands it as return type as Student
    public  Student(String n, String e, String ph,String parent,int roll,int pinCode,String menEmail) {
        name=n;
        email=e;
        phNo=ph;
        parentPhNo=parent;
        rollNo=roll;
        hometownPincode=pinCode;
        mentorEmail=menEmail;
    }
}
        

public class studentDetails {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        //so if we use the constructor we can write all these or else
        // s1.name="sanju";
        // s1.email="sanju@sst.com";
        Student s1 = new Student("sanjana", "sanju@sst.com", "7816071938", "papa",30, 509125, "yash@sst.com");
       System.out.println(s1.name);

    }
    
}
