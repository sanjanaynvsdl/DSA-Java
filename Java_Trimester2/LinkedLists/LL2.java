// import java.util.*;
class ListNode{
    int val;
    ListNode next;
    public ListNode(int value){
        this.val=value;
        this.next=null;
    }
}

//LL is fav for MS Amazon and Adobe
//LL (edge cases are very important)
//In-space Space complexity is O(1);

//1 mid of two LL ===>(LL Test 1)
//2 reverse the linked list
//3 Reverse the linked list k times
//4 Reverse the linked list k times of k size 
//5 Reverse the Linked list from position B to C 
//6 GIven linked list merge them without using extra space in increasing order
//7 GIven LL merge them in decreasing order(Asked in google)


public class LL2 {

    //1
    /*Given a Linked list find the mid node of the given linked list */
    public int midListNode(ListNode A) {
        int mid=0;
        ListNode slow=A;
        ListNode fast=A;
        while(fast.next!=null && fast.next.next!=null) {
            mid=slow.val;
            slow=slow.next;
            fast=fast.next.next;
        }
        return mid;
    }
    //BUt in this we return slowval for odd length
    //test case failed for even length (if we store mid) then odd case fails


    //2
    /*Given a linked list reverse the linked list */
    //1->2->3->4->5->null
    //null<-1<-2<-3<-4<-5
    //                  prev //by last iteration prev points to 5 this is head 
    // the logic is we change link 
    //By taking pointers
    public ListNode reverse(ListNode A) {
        if(A==null) {
            return null;
        }
        else if(A.next==null) {
            return A;
        }
        ListNode prev=null;
        ListNode currNode=A;
        ListNode next=currNode.next;
        while(currNode!=null) {
            next=currNode.next; //stores the next node
            currNode.next=prev; // and then reverse the LL and points o null
            prev=currNode; // prev points to currNode
            currNode=next;  //after reversing again it comes back(since we have stored currNode.next) int next

        }
        return prev;
        //returns prev coz this is the head;

    }

    //3   //4
    /*Given a linked list reverse the list k no. of times and return  new head */
    public ListNode reverseK(ListNode A,int k) {
        if(A==null || A.next==null || k==1) {
            return A;
        }
        ListNode prev=null;
        ListNode currNode=A;
        ListNode next=currNode.next;
        int i=1;
        while( i<=k && currNode!=null) {
            next=currNode.next;
            currNode.next=prev;
            prev=currNode;
            currNode=next;
            i++;
        }
        A.next=next; //attach the k+1 node to the head
        //coz after reversing k nodes head comes to the last node A) so A.next=next;
        //This is used to reverse only k node
        //A.next=reverseK(next,k);
        //this is used to iterate overall list reverse every group of K nodes k times
        /*
         A = [1, 2, 3, 4, 5, 6]
         k = 2
         *  [2, 1, 4, 3, 6, 5]
         * 
         */
        return prev;
        //return the head of the final linked list 
    }

    //5
    /*Given a linked list  reverse from B to C position */
    public ListNode fromB(ListNode A,int B,int C) {
        ListNode prev1=null;
        ListNode curr1=A;
        for(int i=1;i<B && curr1!=null;i++) {
            prev1=curr1;
            curr1=curr1.next;
        }
        ListNode prev2=null;
        ListNode curr2=curr1;
        ListNode next=curr2.next;
        for(int i=B;i<=C && curr2!=null;i++) {
            next=curr2.next;
            curr2.next=prev2;
            prev2=curr2;
            curr2=next;
        }
        if(prev1!=null) {
            prev1.next=prev2;
            prev1.next.next=curr2;
            return A;
        }
        else {
            A.next=prev2;
            return prev2;
        }
    }

    //6 , 7
    /*Given two sorted linked list merge them wihtout using another extra space */
    /*Try implementing this in decreasing merge sort just add elemens in the start  */
    //For decreasing order just change the condition to(A.val>B.val) rest is same
    public ListNode merge(ListNode A,ListNode B) {
        //Edge cases
        if(A==null) {
            return B;
        }
        else if(B==null) {
            return A;
        }
        ListNode head;
        if(A.val>B.val) {
            head=A;
            A=A.next;
        }
        else {
            head=B;
            B=B.next;
        }
        ListNode currNode=head;
        while(A!=null && B!=null) {
            if(A.val>B.val) {
                currNode.next=A;
                A=A.next;
                currNode=currNode.next;
            }
            else{
                currNode.next=B;
                B=B.next;
                currNode=currNode.next;
            }
        }
        if(A!=null) currNode.next=A;
        if(B!=null) currNode.next=B;
        return head;
    }
    

    

    
}
