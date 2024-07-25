
package Hashing;

import java.util.*;

public class HashhMap {
    //syntax is same of hashset 
    //(key==>alwys unique, value==>can be same ) 
    //HashMap<key(datatype), value(datatype)> variable_name = new HashMap<>();

    //Itretion HashMap==(entryset ,KeySet)(2typs)

    public static void main(String[] args) {

        //country(key) population(value)
        HashMap <String, Integer> map = new HashMap<>();


        //Insertion(to add)
        //variable _name.put
        map.put("china",100);
        map.put("india",500);
        map.put("Gadwal",200);

        System.out.println(map);
        //it prints in unordered way!

        map.put("india",1000);
        //re-inserted the value of inida and it is updated!
        //prints india =1000

        //SEARCH
        if(map.containsKey("india")); {
            System.out.println("key exists");
        }
        
            System.out.println("key doesn't exist");
    
        System.out.println(map.get("india")); //prints value(key exists)
        System.out.println(map.get("chinaa")); //prints null value




        int [] A ={1,2,3};
         //old way
        for(int i=0;i<3;i++) {
            System.out.println(A[i]+" ");  
        }

        //new (syntax)
        for(int val : A) {
            System.out.println(val+" ");
        }
        //array values are stored in variables they 
        //are directly printed no need of itretor!!




        //Itretion in HashMap
        //for(int val : A )
        //for(Map.Entry<Datatype ,Datatype> vaiable name : Map.entrySet());
        //(.getKey()) (.getValue())

        //correct
        // for(Map.Entry<String, Integer> e : map.entrySet()); {
        //     System.out.println(e.getKey());
        //     System.out.println(e.getValue());
        // }
        Set<String> Keys = map.keySet();
        for(String Key : Keys) {
            System.out.println(Key+" "+map.get(Key));
        }



    }
   
}

