package Class_Objects;

//instead a making more classes we can make one class and out all the common things in one class
//and the other classes can inherit the common things from the parent class 
//we make super class ==> have common attributes and commmon functions

//Student class extends the User class
//even Mentor class extends the User class
class User{
    private String name;
    private String email;
    private String phNo;
    private int pinCode;


    public User(String name, String email, String phNo, int pinCode) {
        this.name = name;
        this.email = email;
        this.phNo = phNo;
        this.pinCode = pinCode;
    }
    void  printProfile() {
        System.out.println(name + " " + email + " " + phNo + " " + pinCode);
    }
    boolean fromSamePin(User u) {
        if(this.pinCode==u.pinCode) {
            return true;
        }
        return false;
    }
    String getName() {
        return this.name;
    }
    String getEmail() {
        return this.email;
    }
    String getPhNo() {
        return this.phNo;
    }
    int getPinCode() {
        return this.pinCode;
    }
    
}

class Student extends User{
    private String mentorEmail;
    private double CgR;
    private int schloarship;
    public Student(String name, String email, String phNo, int pinCode) {
        super(name, email, phNo, pinCode);
    }

    int calculateFee() {
        int fees=5000;
        int feeDedcut=fees-this.schloarship;
        return feeDedcut;
    }
    void setMentorEmail(String email) {
        this.mentorEmail=email;
    }
    void setScholarship(int scholarship) {
        this.schloarship=scholarship;
    }
    void setCgR(double CgR) {
        this.CgR=CgR;
    }
    //we should mention the out put data type
    String getMentorEmail() {
        return this.mentorEmail;
    }
    double getCgR() {
        return this.CgR;
    }
    int getScholarship() {
        return this.schloarship;
    }
}

class Mentor extends User{
     String Company;
     String  jobprofile;
    int salary;
    public Mentor(String name, String email, String phNo, int pinCode, String comp, String job, int sal ) {
        super(name, email, phNo, pinCode);
        this.Company=comp;
        this.jobprofile=job;
        this.salary=sal;
    }

}


public class inheritance {
    public static void main(String[] args) {
        Student s1=new Student("Rahul", "rahul@sst.com", "1234567890", 1234);
        Mentor m1=new Mentor("Rudhuu", "anii@icfai.com", "0987654321", 1234,"Instructor","SDE2",6);
        

        s1.printProfile();
        System.out.println(s1.fromSamePin(m1)); //output is true
        s1.setCgR(0.9);
        System.out.println(s1.getCgR()); //output is 0.9
    }
    
}
