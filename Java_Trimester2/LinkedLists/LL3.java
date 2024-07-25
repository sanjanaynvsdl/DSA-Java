class ListNode {
    int val;
    ListNode next;
    ListNode(int value) {
        this.val = value;
        this.next = null;
    }
}
//Do check commented code too
public class LL3 {
    //Best T.C for searching in sorted array is O(log N) using binary search
    //But for linked list it is O(N) as we have to traverse the whole list
    //How mnay swaps are required for swapping in LL 0
    //so it is better to use linked list than insertion sort


    //1 
    //2
    //3
    //4
    //5
    //6

    //0 Reverse linked list using recursion
    //TC(O(N)) SC(O(N)) so it is better to use last class method
    //but the interviewer may ask you to do it using recursion
    //function is not yet implemented

    //tail Recursion TC(O(N)) SC(O(1))
    public ListNode reverse(ListNode A) {
        if(A==null || A.next==null) {
            return A;
        }
        ListNode head=reverse(A.next);
        A.next.next=A;
        A.next=null;
        return head;
    }

    //1 Given a linked list sort it using (merge sort)
    /* public ListNode midListNode(ListNode A) {
        ListNode mid=null;
        ListNode slow=A;
        ListNode fast=A;
        ListNode evenmid=null;
        while(fast.next!=null && fast.next.next!=null) {
            evenmid=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast==null) {
            mid=evenmid;
        }
        else {
            mid=slow;
        }
        return mid;
    } */
    public ListNode merge(ListNode A, ListNode B) {
        if(A==null) return B;
        if(B==null) return A;
        ListNode head;
        if(A.val<B.val) {
            head=A;
            A=A.next;
        }
        else {
            head=B;
            B=B.next;
        }
        ListNode currNode=head;
        while(A!=null && B!=null) {
            if(A.val<B.val) {
                currNode.next=A;
                A=A.next;
                currNode=currNode.next;
            }
            else {
                currNode.next=B;
                B=B.next;
                currNode=currNode.next;
            }
        }
        if(A!=null) currNode.next=A;
        if(B!=null) currNode .next=B;
        return head;
    }
    // public ListNode mergeSort(ListNode A) {
    //     if(A==null || A.next==null) return A;
    //     ListNode mid=midListNode(A);
    //     ListNode head2=mid.next;
    //     mid.next=null;
    //     A=mergeSort(A);
    //     head2=mergeSort(head2);
    //     return merge(A,head2);

    // }
    // public ListNode sortList(ListNode A) {
    //    return mergeSort(A);
    // }

    //2
    /*Given a 2D list */



    
}
