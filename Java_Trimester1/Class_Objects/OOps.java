package Class_Objects;
 class pen {
    
    String colour;
    String type; 

    //ballpoint or gel
    //in class we write a blue print of pen 
    //function of pen
    //functions written in class are called methods

    public void write() {
        System.out.println("Writting something");
    }
    //this is blue print of pen 
}



public class OOps {
     public static void main(String[] args) {
        pen pen1 = new pen();
        //1st object (name is the above class)
        //now define the colour and type of pen
        pen1.colour = "blue";
        pen1.type = "gel";
        pen1.write(); //to call function we use (.)
    }

    
}
