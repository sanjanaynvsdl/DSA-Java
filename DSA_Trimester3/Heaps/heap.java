import java.util.*;
public class heap {
    public static int[] smallest(int arr[], int k){
    // TC : O(N) for minHeap + O(KlogN) ktimes to delete(logN) 
    // SC : O(N)
        PriorityQueue<Integer> min = new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
          min.add(arr[i]);
        }
        //O(NlogN)
        int[] small = new int[k];
        for(int i=0;i<k;i++){
          small[i] = min.poll();
          //O(K*logN)
        }
        return small;
      }
      public static void main(String[] args) {
        int[] arr = {1, 10, 4, 2, 20, 15};
        int k = 3;
        int[] result = smallest(arr, k);
        System.out.print("The " + k + " smallest elements are: ");
        for (int i=0;i<k;i++) {
            System.out.print(result[i] + " ");
        }
      }
    
}
