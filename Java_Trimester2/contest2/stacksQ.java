public class stacksQ {
    /*given a  */

    public class Solution {
        public int[] solve(int[] A) {
            int ans[]=new int[A.length];
            Stack<Integer> st= new Stack<Integer>();
            for(int i=A.length-1;i>=0;i--) {
                if(st.isEmpty()) {
                    st.push(i);
                    ans[i]=0;
                }
                else if(A[i]<A[st.peek()]) {
                    ans[i]=st.peek()-i;
                    st.push(i);
                }
                else {
                    while(!st.isEmpty() &&  A[st.peek()]<=A[i]){
                        st.pop();
                        if(st.isEmpty()){
                            ans[i]=0;
                        }
                        else {
                            ans[i]=st.peek()-i;
                        }
                    }
                    st.push(i);
                }
            }
            return ans;
            
        }
    }
    
    
}
