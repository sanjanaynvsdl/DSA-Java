import java.util.*;

//Queues Similar  Data Structure as Stacks
//Queue is a FIFO (First In First Out) Data Structure
//In Queue we have a different pointer two pointers we start from front  and end at rare end
//Addition happens at the rare end and deletion happens at the front end
//Example: Waiting in a Queue for a Movie Ticket
//IN CS code is executed line-by-line 


//To create a queue we can use this data sructures
//1. Array
//2. LinkedList
//3. Stack




//strating from a queue in printer and going till facebook messenger
//Queues are abstract data types
// It has functions
//Queues need functionality 
//Enqueue / add()
//Dequeue / poll()
//size()
//isEmpty()


/*Queing system
 * kafta
 * Rabbit Mq
 * Active Mq
 */
//Amortized TC
//They will take requestes and the requests will queued up 
//and processed in a FIFO manner
public class Ques1 {

    //1
    //2
    //3 
    //4 sliding window


    /*Given a queue having N elements . Reverse the  first k elements of the queues */
    /*1. we eq() k elemets from queue and store into stack and from stack we dq to queue 
     *then N-K elements will be eq() and then dq() 
     */
    public static void rev(Queue<Integer>q,int k) {
        if(k<=0 || k>q.size()) {
            System.out.println("Invalid k");
            return;
        }
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<k;i++) {
            // Step 1: Enqueue the first k elements into the stack
            st.push(q.poll());
        }
        while(!st.isEmpty()) {
            q.add(st.pop());
        }
        for(int i=0;i<q.size()-k;i++) {
            q.add(q.poll());
        }

    }
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        rev(q,3);
        System.out.println(q);
        
    }

    //2 
    /*Implement a queue using stack
     * it should heave function
     * 1. add() enqueue
     * 2. poll() dequeue
     * front()
    */
     public static class QueueUsingStack {
         Stack<Integer> st1=new Stack<>();
         Stack<Integer> st2=new Stack<>();
         public void add(int val) {
             st1.push(val);
         }
         public int poll() {
             if(st1.isEmpty() && st2.isEmpty()) {
                 System.out.println("Queue is empty");
                 return -1;
             }
             if(st2.isEmpty()) {
                 while(!st1.isEmpty()) {
                     st2.push(st1.pop());
                 }
             }
             return st2.pop();
         }
         public int front() {
             if(st1.isEmpty() && st2.isEmpty()) {
                 System.out.println("Queue is empty");
                 return -1;
             }
             if(st2.isEmpty()) {
                 while(!st1.isEmpty()) {
                     st2.push(st1.pop());
                 }
             }
             return st2.peek();
         }
    }
    //3
    /*Given  */



    
    
}
