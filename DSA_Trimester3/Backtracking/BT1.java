
//SubArrays should contigious
//Sub-sequence and sub-sets need not to be in a contigious order
//1 Generate all N digit numbers using (1,2)
//2 Generate all the sub-sets/ sub-sequence of the given array!
public class BT1 {
    //Back-tracking
    //Try-out all the possibilities (brute force)
    //if constraints are small then it's a hint to use back-tracking
    //every back-tracking problem is solved using recursion

    //1
    /* Generate all N digit numbers using {1,2}
     * _ _ _
     * Step-1:
     * Add 1
     * 1 _ _ and then 
     * recursion generates all the numbers for the numbers 
     * remove(1);
     * Add = 2;
     * Then generate all the numbers for it 
     */
    public static ArrayList<Integer> deepCopy(ArrayList<Integer> list) {
        ArrayList<Integer> ans=new ArrayList<>();
        for(int nums:list) {
            ans.add(nums);
        }
        return ans;
    }
    public static void generate(ArrayList<ArrayList<Integer>> ans,int N,ArrayList<Integer> list) {
        if(list.size()==N) {
            ans.add(new ArrayList<>(list));
            // ans.add(deepCopy(list));
            //should not directly add the list make a clone of it and add!
            return;
        }
        //when does a list becomes empty?
        list.add(1);
        generate(ans, N, list);
        list.remove(list.size()-1);
        list.add(2);
        generate(ans, N, list);
        list.remove(list.size()-1);
    }
    public static ArrayList<ArrayList<Integer>> genNUm(int N) {
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        generate(ans, N, list);
        return ans;
    }

    //2
    /*generate all the sub-sets/sub-sequence for a given array */
    public void genSubSets(ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> list, int A[],int s) {
        if(A.length==0) {
            ans.add(new ArrayList<>(list));
            return;
        }
        list.add(A[s]);
        genSubSets(ans,list,A,s+1);
        list.remove(list.size()-1);
        genSubSets(ans, list, A, s+1);
    }
    // public ArrayList<ArrayList<Integer>> subSets(int A[]) {

    // }
    public static void main(String[] args) {
        int N=3;
        ArrayList<ArrayList<Integer>> ans=genNUm(N);
        // for(int i=0;i<ans.size();i++) {
        //     for(int j=0;j<ans.get(i).size();j++) {
        //         System.out.println(ans.get(i).get(j));
        //     }
        // }
        // System.out.println();
        //this gives single numbers to get lists use below main method
        for (ArrayList<Integer> list : ans) {
            for (int num : list) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    
}
