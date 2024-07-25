package Class_Objects;


//to create arraylist using classes and objects.
//This is how arrayList is craeted in java.
//In one cass we can have multiple constructors.

public class cls2 {
    int arr[];
    int size;
    public  cls2() {
        arr=new int[4];
    }
    public cls2(int size) {
        arr=new int[size];
    }
    void add(int k) {
        if(arr.length==size) {
            //if all the elements are filled then we need to 
            //create a new array of double the size and copy the elements from the old array to the new array.
            int temp[]=new int[2*arr.length];
            for(int i=0;i<arr.length;i++) {
                temp[i]=arr[i];
            }
            this.arr=temp; // we have updated the class variable array to new array.    
            arr[size]=k;
            size++;
            // we do size++ because we are adding an element to the array.  

        }
    }
    int size() {
        return this.size;
    }
    int get(int i) {
        //make sure this i is valid
        //or else return invalid index
        if(i<size) {
            return arr[i];
        }//else case
        System.out.println("Invalid index");
        return -1;
    }
    


    
}
