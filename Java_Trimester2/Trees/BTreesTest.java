
// import java.util.*;
class treeNode{
    treeNode left;
    treeNode right;
    int val;
    public treeNode(int val) {
        this.val=val;
        left=null;
        right=null;
    }
}
public class BTreesTest {
    //1
    /*Given a root of the binary tree return the count of nodes  */
    public int countNodes(treeNode A) {
        if(A==null) return 0;
        int l=countNodes(A.left);
        int r=countNodes(A.right);
        return l+r+1;
        //To find the height of the tree return Math.(max(l,r))+1;
    }

    
}
