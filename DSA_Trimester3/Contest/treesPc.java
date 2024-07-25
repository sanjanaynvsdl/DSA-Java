public class treesPc {
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
public class Solution {
    public int solve(TreeNode A) {
    //Awesome binary tree
    Queue<TreeNode> Q=new LinkedList<>();
        if(A==null) {
            return 0;
        }
        Q.add(A);
        int level=1;
        while(!Q.isEmpty()) {
            int size=Q.size();
            boolean isLast=true;
            for(int i=0;i<size;i++) {
                TreeNode temp=Q.poll();
                if(temp.left!=null) {
                    if(!isLast) {
                        return 0;
                    }
                    Q.add(temp.left);
                }
                 else {
                        isLast=false;
                    }
                if(temp.right!=null) {
                    if(!isLast) {
                        return 0;
                    }
                    Q.add(temp.right);
                }
                else {
                    isLast=false;
                }
                    
                
                
            }
            level++;
        }
        return 1;
    }
}

    
}
