import java.util.*;
//1 Delete Node
//2 Check if BST
//3 Check if BST is balanced
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
//2
class Data{
    boolean isBST;
    int min;
    int max;
    public Data(boolean isBST,int min,int max) {
        this.isBST=isBST;
        this.min=min;
        this.max=max;
    }
}
//3
class dataBST{
    boolean isBal;
    int ht;
    dataBST(boolean isBal,int ht) {
        this.isBal=isBal;
        this.ht=ht;
    }
}
public class BST4 {
    //1
    /*Given a binary search tree and integer value delete the node and return */
    //Max value in LST is max of LST
    //Min value in RST is min of RST
    //we have 3-cases to handle
    //1. Node to be deleted is leaf node
    //2. Node to be deleted has one child
    //3. Node to be deleted has two children
    //SO in 2 children we will find max of LST or min of RST and replace it with the node to be deleted
    public treeNode deleteNode(treeNode A,int x) {
        if(A==null) {
            return null;
        }
        if(x<A.val) {
            A.left=deleteNode(A.left,x);
        }
        else if(x>A.val) {
            A.right=deleteNode(A.right,x);
        }
        else {
            if(A.left==null && A.right==null) {
                return null;
            }
            else if(A.left==null) {
                return A.right;
            }
            else if(A.right==null) {
                return A.left;
            }
            else {
                treeNode max=getMax(A.left);
                A.val=max.val;
                //so now my root is being updated with this(max value) now (6,6) goes to recursion reuturns something
                // that will be assigned to A.left;
                A.left=deleteNode(A.left,A.val); // since A.left is null 
                // or
                // treeNode min=getMIn(A.right);
                // A.val=min.val;
                // A.right=deleteNode(A.right,min.val);
            }
        }
        return A;
    }
    public treeNode getMax(treeNode A) {
        if(A==null) {
            return null;
        }
        while(A.right!=null) {
            A=A.right;
        }
        return A;
    }
    public treeNode getMIn(treeNode A) {
        if(A==null) {
            return null;
        }
        while(A.left!=null) {
            A=A.left;
        }
        return A;
    }
    

    //2
    /*Given a tree return true if it is a binary tree else false. 
     * Valid binary search tree
    */

    //this does not work for all cases
    public boolean isBSTt(treeNode A) {
        if(A==null) {
            return true;
        }
        if(A.left==null && A.right==null) {
            return true;
        }
        if(A.left.val>A.val ||A.right.val<A.val) {
            return false;
        }
        return (isBSTt(A.left) && isBSTt(A.right));
    }
 //Brute force by using miniumum and maximum of LST and RST but it is O(N^2);
 public int getMaxx(treeNode A) {
    if(A==null) {
        return 0;
    }
    while(A.right!=null) {
        A=A.right;
    }
    return A.val;
}
public int getMInn(treeNode A) {
    if(A==null) {
        return 0;
    }
    while(A.left!=null) {
        A=A.left;
    }
    return A.val;
}

 public boolean isBSTtt( treeNode root) {
    if(root==null) {
        return true;
    }
    if(root.left==null && root.right==null) {
        return true;
    }
    if(root.val>getMaxx(root.left) && root.val<(getMInn(root.right))) {
        return (isBSTt(root.left) && isBSTt(root.right));
    }
    return false;
 }
    //Here we are calling getMax and getMin for each node so it is O(N^2)
    //By creating our own class we can do it in O(N) time
    public Data isBST(treeNode A) {
        if(A==null) {
            return new Data(true,Integer.MAX_VALUE,Integer.MIN_VALUE);
        }
        Data left=isBST(A.left);
        Data right=isBST(A.right);
        if(left.isBST && right.isBST && A.val>left.max && A.val<right.min)  {
            return new Data(true,Math.min(A.val,Math.min(left.min,right.min)),Math.max(A.val,Math.max(left.max,right.max)));
        }
        return new Data(false,0,0);
        
    }
    //if it is valid binary tree return output as 1 else 0

    //3
    /*Given a BT chechk if it is height balanced binary search tree */ 
    public dataBST isBalanced(treeNode A) {
        if(A==null) {
            return new dataBST(true, 0);
        }
        dataBST left=isBalanced(A.left);
        dataBST right=isBalanced(A.right);
        if(left.isBal && right.isBal && Math.abs(left.ht-right.ht)<=1) {
            return new dataBST(true,Math.max(left.ht,right.ht)+1);
        }
        return new dataBST(false,Math.max(left.ht,right.ht)+1);
    }
    //Serialize the binary tree
    //Given the root node of a Binary Tree denoted by A. You have to Serialize the given Binary Tree in the described format.
        public ArrayList<Integer> serialize(treeNode A) {
            ArrayList<Integer> res=new ArrayList<>();
            if(A==null) {
                return res;
            }
            Queue<treeNode> q=new LinkedList<>();
            q.add(A);
            while(!q.isEmpty()) {
                treeNode temp=q.poll();
                if(temp==null) {
                    res.add(-1);
                }
                else {
                    res.add(temp.val);
                    q.add(temp.left);
                    q.add(temp.right);
                }
            }
            return res;
        }
        //Deserialize the binary tree

        public treeNode deserialize(ArrayList<Integer> A) {
            if(A.size()==0) {
                return null;
            }
            treeNode root=new treeNode(A.get(0));
            Queue<treeNode> q=new LinkedList<>();
            q.add(root);
            int i=1;
            while(!q.isEmpty() && i<A.size()) {
                treeNode temp=q.poll();
                if(A.get(i)!=-1) {
                    temp.left=new treeNode(A.get(i));
                    q.add(temp.left);
                }
                i++;
                if(A.get(i)!=-1) {
                    temp.right=new treeNode(A.get(i));
                    q.add(temp.right);
                }
                i++;
            }
            return root;
        }   
        //Given preorder traversal of a binary tree, check if it is possible that it is also a preorder traversal of a Binary Search Tree (BST), where each internal node (non-leaf nodes) have exactly one child.
        public String  treeFromPreorder(int[] A) {
            if(A.length==0) {
                return "YES";
            }
            Stack<Integer> s=new Stack<>();
            int root=Integer.MIN_VALUE;
            for(int i=0;i<A.length;i++) {
                if(A[i]<root) {
                    return "NO";
                }
                while(!s.isEmpty() && s.peek()<A[i]) {
                    root=s.pop();
                }
                s.push(A[i]);
            }
            return "YES";
        }
        // /*Given a binary search tree of integers. You are given a range B and C.
        // Return the count of the number of nodes that lie in the given range. 
        public int countNodesInRange(treeNode root, int B, int C) {
            if (root == null) {
                return 0;
            }
            
            if (root.val < B) {
                return countNodesInRange(root.right, B, C);
            }
            
            if (root.val > C) {
                return countNodesInRange(root.left, B, C);
            }
            
            return 1 + countNodesInRange(root.left, B, C) + countNodesInRange(root.right, B, C);
        }


       
}
