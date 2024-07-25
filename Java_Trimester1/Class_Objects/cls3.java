package Class_Objects;

//this key word make sense only if the functions are non-static
    /*Attributes
     * Name
     * email
     * Phone.No
     * Home pinCode
     * mentor Email
     * Scholarship
     * CGR
     * 
     * Functionnn
     * PrintProfile() ==> prints name email phone no.
     * belongs to same locality(STudent S) return true if student have same home pincode
     * calculate fee() dedcut the amout of scholarship from the total fee and return the amount to be paid
     *  
     * 
     */

     //we use private because we dont want to access the variables outside the class
     //we use public because we want to access the functions outside the class
     //we make private so no on can access the variables outside the class

    class StudentClass{
        String name;
        String email;
        String phN0;
        int homePinCode;
        String mentormail;
    private int scholarShip; //if i use private here this schlor ship is not accesiiible outside the class since it is private
        double  CGR;


        //if we make constror as private we wont be able to make objects oytside the class
        //Constructor
        public StudentClass(String name,String email,String phN0,int homePinCode) {
            this.name=name;
            this.email=email;
            this.phN0=phN0;
        }
        public void printProfile() {
            System.out.println("Name "+this.name);
            System.out.println("Email "+ this.email);
            System.out.println("Phone No "+ this.phN0);
        }
        public boolean belongsToSameLocality(StudentClass S) {
            return this.homePinCode==S.homePinCode;
        }
        public int caculateFee() {
            int fee = 500000;
            int feeDeduction = this.scholarShip * fee / 100;
                 return fee - feeDeduction;
        }

        //getters and setters
        //we use getters and setters to access the private variables outside the class
        public int getSch() {
            return  this.scholarShip;
        }
        public void setSch(int s) {
            //we can also set the validations 
            if(s>=0 && s<=100)
           this.scholarShip=s;
        }

    }
public class cls3 {
    public static void main(String[] args) {
        StudentClass S1=new StudentClass("Sanjana","sanju@sst.com","1234567890",123456);
        S1.printProfile();
        //System.out.println(S1.scholarShip); //we havnt initialized the scholarship so it will print 0
        System.out.println(S1.mentormail);   //we havnt initialized the mentor mail so it will print null
        //This means inside mentormail there is nothing.
        //S1.scholarShip=50; this is not accessible if i use  private
        //instead using s1.scholarship() we can use getters and setters
        S1.setSch(20);
        System.out.println(S1.getSch()); //output 20 
    }
    



    /*s1.phNo="abcd"
     * To avoid this type of junk isseus we use private in the class
     * but if we want to get and set the values 
     * we can create get and set functions for this in the Student Class
     */

    
}
