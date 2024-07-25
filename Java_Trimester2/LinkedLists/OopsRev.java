//This is without constructor with using constructor we can mak epur task more easier! written in class 
//Class= is a blue print!
//Class has Attributes and methods
class Car{
     // attributes
    String modelName;
    int number;
    //methods
     void drive() {
        System.out.println("Groom groom");
    }
     void accelerate(){
        System.out.println("Car is speeding up");
    }

}
/* In above code we are creating a class with name Car. 
-> Attributes: modelName, owner and regNumber
-> Methods : drive and accelerate. */
public class OopsRev {
    public static void main(String[] args) {
        Car c1=new Car();
        c1.modelName="BMW";
        c1.number=1234;
        System.out.println(c1.modelName);
        //we can find the difference between c1 and c2 these is the difference between the two objects.
        //Using constructor we can make our task more easier.  
        // Carr c2=new Carr("BMW",1234);
       System.out.println(c1.modelName);

    }
}
//This is a another class with constructor.
class Carr{
    // attributes
   String modelName;
   int number;

   Carr(String a, int b) {
        modelName = a;
         number= b;
    }
   //methods
    void drive() {
       System.out.println("Groom groom");
   }
    void accelerate(){
       System.out.println("Car is speeding up");
   }

}


