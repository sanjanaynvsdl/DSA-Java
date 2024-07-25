
import java.util.*;
//1 level-Order-Traversal
//2 Left-View
//3 Right-View
//4 Vertical-Order-Traversal
//5 Top-View
//6 Bottom-view

//May ask
//8 Boundary-Traversal
//Zig-Zag Traversal 


//Extra
//7 Diagonal-View
//9 Diagonal-Traversal
//10 Reverse-Level-Order-Traversal
//11 Spiral-Order-Traversal
//12 Level-Order-Traversal-in-Spiral-Form



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
class pair{
        treeNode node;
        int dist;
        public pair(treeNode data,int dist) {
            this.node=data;
            this.dist=dist;
        }
    } 

public class BTrees3 {
    //Level order traversal Questions

    //1
    /*Given a Binary tree rerurn the level-order traversal of the treee in a 2D-ArrayList */
    //The worst case  of SC is O(n) when the tree is a complete binary tree or skewed binary tree
    /*For zig-zag traveral we check the level if it odd reverse if it is even keep it same  */

    //TC O(N)
    //SC O(N)
    public ArrayList<ArrayList<Integer>> levelOrder(treeNode A) {
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        Queue<treeNode> Q=new LinkedList<>();
        Q.add(A);
        int size=Q.size();
        while(!Q.isEmpty()) {
            //We will create temporart arrayList to store the elements of the current level
            ArrayList<Integer> curr=new ArrayList<>();
            for(int i=0;i<size;i++) {
                treeNode temp=Q.poll();
                curr.add(temp.val);
                if(temp.left!=null) {
                    Q.add(temp.left);
                }
                if(temp.right!=null) {
                    Q.add(temp.right);
                }
            }
            ans.add(curr);

        }
        return ans;


    }

    //2
    //Amazon Microsoft Adobe (Standard Questions and repeated)
    /*Given a binary tree return the left view of the binary tree in  */

    public ArrayList<Integer> leftView(treeNode A) {
        ArrayList<Integer> ans=new ArrayList<>();
        Queue<treeNode> Q=new LinkedList<>();
        Q.add(A);
        while(!Q.isEmpty()){
            int size =Q.size();
            for(int i=0;i<size;i++) {
                treeNode temp=Q.poll();
                if(i==0) {
                    ans.add(temp.val);
                }
                if(temp.left!=null) {
                     Q.add(temp.left);
                }
                if(temp.right!=null) {
                    Q.add(temp.right);
                }
            }
        }
        return ans;


    }

    //3
    /*Given a binary tree return a arrayList of elements in the right-view */
    public ArrayList<Integer> rightView(treeNode A) {
        ArrayList<Integer> ans=new ArrayList<>();
        Queue<treeNode> Q=new LinkedList<>();
        Q.add(A);
        while(!Q.isEmpty()){
            int size=Q.size();
            for(int i=0;i<size;i++) {
                treeNode temp=Q.poll();
                if(i==size-1) {
                    ans.add(temp.val);
                }
                if(temp.left!=null) {
                    Q.add(temp.left);
                }
                if(temp.right!=null) {
                    Q.add(temp.right);
                }
            }
        }
        return ans;

    }
    //4
    /*Given a binary tree return the zig-zag level -order of the node value
     * hint : if level is odd reverse the list else keep it same
     */
    public ArrayList<ArrayList<Integer>> zigzag(treeNode A) {
        ArrayList<ArrayList<Integer>> ans= new ArrayList<>();
        Queue<treeNode> Q=new LinkedList<>();
        int level=1;
        Q.add(A);
        while(!Q.isEmpty()) {
            ArrayList<Integer> list= new ArrayList<>();
            int size=Q.size();
            for(int i=0;i<size;i++) {
                treeNode temp=Q.poll();
                list.add(temp.val);
                if(temp.left!=null) {
                    Q.add(temp.left);
                }
                if(temp.right!=null) {
                    Q.add(temp.right);
                } 
            }
            if(level%2!=0) {
                Collections.reverse(list);
            }
            ans.add(list);
            level++;
        }
        return ans;
    } 
    //5
    /*Given a binary tree return the top-view of the binary tree*/
    // public ArrayList<Integer> topView(treeNode A) {
    //     ArrayList<Integer> ans=new ArrayList<>();
    

    // }   

    

    //6
    /*Given a binary tree return the vertical view of the elements in a arrayList */
    
    public ArrayList<ArrayList<Integer>> verticalView(treeNode A) {
            ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
            HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
            Queue<pair> Q=new LinkedList<>();
            Q.add(new pair(A,0));
            while(!Q.isEmpty()) {
                ArrayList<Integer> list=new ArrayList<Integer>();
                int size=Q.size();
                for(int i=0;i<size;i++) {
                    pair temp=Q.poll();
                    treeNode node=temp.node;
                    int dist=temp.dist;
                    if(!map.containsKey(dist)) {
                        map.put(dist,new ArrayList<Integer>());
                    }
                    list.add(node.val);
                    if(node.left!=null) {
                        Q.add(new pair(node.left,dist-1));
                    }
                    if(node.right!=null) {
                        Q.add(new pair(node.right,dist+1));
                    }
                }
                for(int i=0;i<list.size();i++) {
                    map.get(i).add(list.get(i));
                }

                ans.add(list);
            }
            return ans;
    
    }    
}
