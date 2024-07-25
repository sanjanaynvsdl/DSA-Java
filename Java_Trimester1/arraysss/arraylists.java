package arraysss;

import java.util.ArrayList;

public class arraylists {

    //Arraylist size is dynamic(it is stored in heap memory)
    //we cannot use primitives (int,float,etc) use only objects 
    //Objects (Integer | Float | Boolean | String(uppercase))

    //functions and classes used in arraylist

    //list.add(1) we can add elements list.add(1,4) on index 1 4 is added
    //list.get(0) to access the elements (i=index)
    //list.set(1,4) to replace 4 in place of 1 index
    //list.remove(0) deletes the number on 0 index
    //to sort thing in increasing order Collections.sort




    /*public static void main(String [] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        //ArrayList<String> list2 = new ArrayList<Integer>(); used in case of string

       //add element
       list.add(0);
       list.add(1);
       list.add(3);
       list.add(5);
       System.out.println(list);

       //get elements
       int element = list.get(3); //we cane access the element in 0 index
       System.out.println(element);
       
       //to add element in between
       list.add(1,4); //adds elemnt 4 on index 1
       System.out.println(list);

       //set element 
       list.set(0,5); //the element changes to 5 on 0 index
       System.out.println(list);
       
       //delete element
       list.remove(3); //so the number on index 3 will be deleted
       System.out.println(list);

       //size
       int size = list.size();
       System.out.println(size);

       //loops
       for(int i=0;i<list.size();i++) {
        System.out.print(list.get(i));
       }
       System.out.println();

    }

    */


    /*Given a array given a number K 
     * write a function which returns count of pairs  there exists i,j
     * such that A[i]+A[j]=k && i!=j
     */

     public static int pairSumCount(ArrayList<Integer> A,int k) {
        int count=0;
        for(int i=0;i<A.size();i++) {
            for(int j=0;j<A.size();j++) {
                if(i!=j && (A.get(i)+A.get(j))==k) {
                    count++;
                }
            }
        }
        return count/2; //(1,2) & (2,1) so we are not taking two times we use count/2

     }

    

    
}