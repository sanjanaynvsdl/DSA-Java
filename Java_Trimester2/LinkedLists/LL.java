//create a class for node 
// it stores present data and address of next node;
// Linked list it is not stored in  contigious memory
class ListNode{
    int value;
    ListNode next;
    public ListNode(int value){
        this.value=value;
        this.next=null;
    }
}
public class LL {
    ListNode head;
    public  ListNode addFirst(int x) {
        ListNode newNode=new ListNode(x);
        if(head==null) {
            head=newNode;
        }
        newNode.next=head;
        head=newNode;
        return head;
    }
    
    public static void main(String[] args) {
        LL List= new LL(); //create a new linked list and add nodes to it
        ListNode node1=List.addFirst(6);
        System.out.println(node1.value);
    }
    
}
