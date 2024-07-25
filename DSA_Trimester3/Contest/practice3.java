public class practice3 {
    //priority queue 3rd questions
    //by using our custom comparator
    //1
    public class Solution {
        class data{
            int index;
            int val;
            public data(int index, int val) {
                this.index=index;
                this.val=val;
            }
        }
        class custom implements Comparator<data> {
            public int compare(data A, data B) {
                return A.val-B.val;
                
            }
        }
        public int solve(int[] A, int B) {
            Queue<data> pq=new PriorityQueue(new custom());
            int curr[]=new int[A.length];
            for(int i=0;i<A.length;i++) {
                curr[i]=A[i];
                pq.add(new data(i,A[i]*2));
            }
            while(B-->0) {
                data temp=pq.poll();
                curr[temp.index]=temp.val;
                pq.add(new data(temp.index,curr[temp.index]+A[temp.index]));
            }
            int max=Integer.MIN_VALUE;
            for(int i=0;i<curr.length;i++) {
                if(curr[i]>max) {
                    max=curr[i];
                }
                else {
                    max=max;
                }
            }
            return max;
            
        }
    }
    

//2
//Using level order trees question summantion of A[i]*(depth) of all nodes 
/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
// public class Solution {
    public int solve(TreeNode A) {
        int M=1000000007;
        Queue<TreeNode> Q=new LinkedList<>();
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        if(A==null) {
            return 0;
        }
        // long sum=0;
        Q.add(A);
        while(!Q.isEmpty()) {
            int size=Q.size();
            ArrayList<Integer> list=new ArrayList<>();
            for(int i=0;i<size;i++) {
                TreeNode temp=Q.poll();
                list.add(temp.val%M);
                if(temp.left!=null) {
                    Q.add(temp.left);
                }
                if(temp.right!=null) {
                    Q.add(temp.right);
                }
            }
            ans.add(list);
        }
        long sum=0;
        for(int i=0;i<ans.size();i++) {
            for(int j=0;j<ans.get(i).size();j++) {
                sum = (sum%M + ((long)(ans.get(i).get(j))%M*i%M)%M)%M;
            }
        }
        return (int)(sum%M);
    }
        
        // if(A==null) {
        //     return 0;
        // }
        // long ans=depth(A,0);
        // return (int)(ans%1000000007);
        
        
    
    
    // public int  depth(TreeNode A, int dep) {
    //     int M=1000000007;
    //     if(A==null) {
    //         return  0;
    //     }
        
    //     long ans = (ans%M + ((A.val)%M*dep%M)%M)%M;
    //     depth(A.left,dep+1);
    //     depth(A.right,dep+1);
    //     // return (int)(ans%M);
    // }

    //3
    //suing seives algorithm primes
    // public class Solution {
        public int[] solve(int A) {
            ArrayList<Integer> ans=new ArrayList<>();
            ans=primes(A);
            int prim[]=new int[ans.size()];
            for(int i=0;i<prim.length;i++) {
                prim[i]=ans.get(i);
            }
            return prim;
            
            
        }
        public ArrayList<Integer> primes(int A) {
            boolean isBol[]=new boolean[A+1];
            ArrayList<Integer> ans=new ArrayList<>();
            for(int i=0;i<=A;i++) {
                isBol[i]=true;
            }
            for(int i=2;i<=A;i++) {
                if(isBol[i]==true) {
                    for(int j=i+i;j<isBol.length && j<=A;j=j+i) {
                        isBol[j]=false;
                    }
                }
            }
            for(int i=2;i<isBol.length;i++) {
                    if(isBol[i]==true) {
                        ans.add(i);
                    }
                }
                return ans;
            
            
        }
    
    

}
    



