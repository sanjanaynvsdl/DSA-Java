
import java.util.*;

public class MyStack1{
    ArrayList<Integer> List;
    public MyStack1(){
        List=new ArrayList<Integer>();
    }
    public void push(int x) {
        List.add(x);
    }
    public int pop(int x) {
        if(List.size()==0) {
            return -1;
        }
        int var=List.remove(List.size()-1);
        return var;
    }
    public int top(int x) {
        if(List.size()==0) {
            return -1;
        }
        int var= List.get(List.size()-1);
        return var;
    }
    public boolean isEmpty(){
        if(List.size()==0) {
            return true;
        }
         return false;
    }
    public static void main(String[] args) {
        MyStack1 newStack1=new MyStack1();
        newStack1.push(10);
        newStack1.push(20);
        int var=newStack1.top(20);
        System.out.println(var);
        
    }
    
   
}