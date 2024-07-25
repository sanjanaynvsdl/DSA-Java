
class ListNode{
    int val;
    ListNode next;
    public ListNode(int value) {
        this.val=value;
        this.next=null;
    }
}
//1 SubArrays
//2 Mid of ListNode
//3 

public class LL1Test {

    /*In Brute force we can convert this into ArrayList and find the mid and return the value
     * But we should solve this without using extra space
     */
    public ListNode midListNode(ListNode A) {
        ListNode slow=A;
        ListNode fast=A;
        while(fast.next!=null && fast.next.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        //if the length is even then we have to return the first mid
        //fast==null indicatred even length
        //fast.next==null indicates odd length!
        
      if(fast.next==null) {
        return slow;
      }
        return slow.next;
    }


    

    
}
