public class heaps2 {
    //Priority Queue
    //1
    //2 Sort the k-th ordered array 
    //3 sort the array - heap sort
    //4 Google

    //1
    /*given an array find the  top (k) smallest elements */
    // TC : O(N) for minHeap + O(KlogN) ktimes to delete(logN) 
    // SC : O(N) 
    // step-1 : By using minHeap so all k small elements are on the top
    
    //Optimal
    // TC : O(k)+O((N)+log(k))
    // SC : 
    // using a max heap => kTh smakkes element is smaller than every(N-k) so caompare with that


    //2
    /*Given a k-sorted array. sort the array k=2
     * TC : using sorting O(NlogN)
     * optimal:
     * create a queue of k+1 size
     * in every iteralog  tion we have one deletion and one insertion
     * TC : O((N-k)log k)
     *
     * 
     * //3 if the question is for complete array we can take k=N then in complete get max put it in the last
     */


     //Thi is an optimal version of the selection sort ( this question)
    // insertion sort : select the max element and out it in the last
    // Selection sort : select the min element and put it in the first 
    // Bubble-sort    :  comparing adjacent elements and swapping most un-optimal 
    // Merge sort     : divide the array into two equal parts sort them sepertely and merge them using recursion
    // Quick-sort     : pick pivot elemnt(any random element) divide array into two parts 1st half smaller than pivot  SC : O(log N)
    // next part greater then pivot this goes in recursively th 

    //heap sort : TC : O(NlogN) SC : O(1)
    //So, till now this is the most optimal solution



    //4
    /* What is the new median of a stream of integer
     * In every insertion return the new median
     */
    // public int[] medainHeap(int A[]) {
        
    // }


    public static void main(String[] args) {
        PriorityQUeue<Inetgere> pq=new PriorityQueue<Integer>();
        //pq.add(x)
        //pq.remove()
        //pq.poll();
        //Explore how to get maxHeap of priority queue
        //How to use comparator ?! 

    }
    
}
