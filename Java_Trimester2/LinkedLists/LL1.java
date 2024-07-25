

// import java.util.*;

/*Head is declared as static 
 * Making it static ensures that there is only one head for all instances.
 * variable can be accessed directly using the class name (LL1.head) without the need to create an instance of the class.
 * we can use both static nd wihtout static 
 */

 /*NExt make a class with a name and construct  */
  class Node {
        int val;
        Node next;

        public Node(int value) {
            this.val = value;
            this.next = null;
        }
    }

public class LL1 {
      Node head; // Declare head as a static variable
    // public void addFirst we can also use this  print the output also in function.
    //we dont use static white wrriting a class inside anothe class.
    public Node addFirst(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode; 
        }
        return head;
    }

    public Node addLast(int value) { 
        //TC O(N)
        //SC O(1)
        Node newNode=new Node(value);
        if(head==null) {
          head=newNode;
        }
        Node currNode=head;
        while(currNode.next!=null) {
            currNode=currNode.next;
        }
        currNode.next=newNode;
        return newNode;
    }
    public Node addKth(int x){
        Node newNode=new Node(x);
        if(head==null){
            head=newNode;
        }
        Node currNode=head;
        for(int i=1;i<x-1 && currNode!=null;i++){
            currNode=currNode.next;
        }
        newNode.next=currNode.next;
        currNode.next=newNode;
        return newNode;
    }
   

   

    public static void main(String[] args) {
        LL1 nNode = new LL1();                  // Create a new linked list and add nodes to it 
        Node n1=nNode.addFirst(5);        // Create node and add it to the linked list
        System.out.println(n1.val);
        Node n2=nNode.addLast(6);
        System.out.println(n2.val);
        Node n3=nNode.addKth(7);
        System.out.println(n3.val);
    }
}
