// Purpose: Implementing stack using linked list
//1st create a class for every node
//class for Stack with function push,pop,peek,isEmpty
public class stacks1 {
    public static void main(String[] args) {
        MyStack stack=new MyStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
    }
    
}
class ListNode{
    int val;
    ListNode next;
    public ListNode(int value) {
        this.val=value;
        this.next=null;
    }
}
//Build a stack using linked list
class MyStack{
    ListNode head;
    public MyStack() {
        this.head=null;
    }
    public void push(int x) {
        ListNode newNode=new ListNode(x);
        if(head==null) {
            head=newNode;
        }
        else {
            newNode.next=head;
            head=newNode;
        } 
    }
    public int pop() {
        if(head==null) {
            return -1;
        }
        int val=head.val;
        head=head.next;
        return val; 
    }
    public int peek() {
        if(head==null)  {
            return -1;
        }
        return head.val;
    }
    public boolean isEmpty() {
        if(head==null) {
            return true;
        }
        return false;
    }
}

