import java.util.*;

public class BT2 {
    //1 Combination sum
    //2 Generate paranthesis

    //1 Combination sum
    /*final answer should have unique sub-sets which sums to B number from givn array A[]
     * There should be no duplicate sub-sets in the final answer
     * In sub-sets questions it is given that there are distinct elements but in this question it is not given
     * 
     * 
     * For every element we have two choices either to pick it skip it 
     * In-subsets question we pick and move to next element to make our choice so, here we 
     * pick and make choice of same element
     * 
     * 
     * If you are getting arrayIndex out of bound exceptions do check the get functions remove functions in the code
     */
    public void sum(ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> list, ArrayList<Integer> A, int target,int idx) {
        if(target==0) {
            ans.add(new ArrayList<>(list));
            return;
        }
        else if(target<0 || idx>=A.size()) {
            return;
        }
        else {
            list.add(A.get(idx));
            sum(ans,list,A,target-A.get(idx),idx);
            list.remove(list.size()-1);
            if(idx+1<A.size()) {
                sum(ans,list,A,target,idx+1);
            }
        }
        
    }
    /*Given a number n=3 generate all the paranthesis 
    {()()() , ((())),  ()(()) , (())() } */
    
}


