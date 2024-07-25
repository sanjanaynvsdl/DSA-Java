package Hashing;
import java.util.*;
public class HasSets {
    public static void main(String[] args) {

        //syntax
        HashSet<Integer> set = new HashSet<Integer>();
        //to insert
        set.add(1);
        set.add(2);
        set.add(3);
        //size
        set.size();
        //to print all elements
        System.out.println(set);
        //iterator
        //in sets we use special iterator
        // Iterator it = set.iterator();
        //two types 
        //it.hasNext ==>(true / false)
        // it.next ==>(gives next element)

        // while(it.hasNext()) { 
        //     //till it.hasnext iterators till last element 
        //     //i++ /i-- is not necessary!
        //     System.out.println(it.next());
        // }
    }

}