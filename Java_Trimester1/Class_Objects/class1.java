package Class_Objects;


 class fruit{
        //blue print is class
        //called atributes(in cls we define atributes)
        String name;
        String taste;
        String colour;
        String size;


    //constructor
    public fruit(String name,String taste,String colour,String size)  {
        this.name = name;
        this.taste=taste;
        this.colour= colour;
        this.size= size; 
    }

    void printName(){
        System.out.println(name);
    }
}
    public class class1 {

    public static void main(String [] args) {
        //classname variable = new classname();
        //fruit A = new fruit();
        fruit A = new fruit("apple", "sweet", "red", "medium"); 
        System.out.println(A.name);
        A.printName();
        System.out.println(A.taste);
        System.out.println(A.colour);
        System.out.println(A.size);

    }
    
}

