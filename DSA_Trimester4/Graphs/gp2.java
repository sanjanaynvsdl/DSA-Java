import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.*;

class Pair{
    int val;
    int parent;
    Pair(int val, int parent) {
        this.val=val;
        this.parent=parent;
    }
}
public class gp2 {
    //Cyclic Graphs 
    //A graph is said to be cyclic if there is a cycle in the graph
    //In BFS and DFS both we need visited array to keep track of visited nodes


    //1
    /*Given a graph and source(s) and destination (D) return true if there
     exists a path from source to destination using DFS */
    public static boolean DFS(int S, boolean[] isVis, ArrayList<Integer>[] ans, int D) {
        if (S == D) {
            return true; // Destination found
        }
        isVis[S] = true;
        for (int i = 0; i < ans[S].size(); i++) {
            int neighbor = ans[S].get(i);
            if (!isVis[neighbor]) { // If the neighbor has not been visited
                if (DFS(neighbor, isVis, ans, D)) {
                    return true; // Path found
                }
            }
        }
        return false; 
    }

    //Given a graph with a source mark are the connections of the source as true 
    public static void DFS(int S, boolean[] isVis, ArrayList<Integer>[] ans) {
        isVis[S] = true;
        for (int i = 0; i < ans[S].size(); i++) {
            int neighbor = ans[S].get(i);
            if (!isVis[neighbor]) { // If the neighbor has not been visited
                DFS(neighbor, isVis, ans);
            }
        }
    }
    //Iterate if the given graph is in the from of matrix
    public static boolean DFS(int S, boolean[] isVis, int[][] ans, int D) {
        if (S == D) {
            return true; // Destination found
        }
        isVis[S] = true;
        for (int i = 0; i < ans.length; i++) {
            if (ans[S][i] == 1 && !isVis[i]) {
                if (DFS(i, isVis, ans, D)) {
                    return true; // Path found
                }
            }
        }
        return false; 
    }

    

    //The case where the graph is not connected 
    //Most of the times we just get a matrix we ourselves form that problem into a graph
    //2
    /* Given a matrix  of 1's and 0's 1's are islands rest are water
     * 
     * 1 1 0 0 0
     * 1 1 0 0 0
     * 0 0 1 0 0
     * 0 0 0 1 1
     * 
     * so in this case we have 3 islands!
     * as we van further simplify these are just the connected components in a graph
     * So , we will 
     */
    // public static int isLands(int )


    //This is incorrect because we are only checking neighbours not all the nodes which are having value 1
    // public void DFS(int A[][], boolean isVis[][],int a, int b) {
    //     int[] rowDelta={-1,0,1,0,-1,1,-1,1};
    //     int[] colDelta={0,-1,0,1,-1,1,1,-1};
    //     for(int i=0;i<7;i++) {
    //         int currRow=rowDelta[i]+a;
    //         int currCol=colDelta[i]+b;
    //         if(currRow>=0 && currRow<A.length && currCol>=0 && currCol <A[0].length && A[currRow][currCol]==1) {
    //             isVis[currRow][currCol]=true;
    //         }
    //     }
    // }
    
    
    public void DFS(int[][] A, boolean[][] isVis, int i, int j) {
        if(i<0 || i>=A.length || j<0 || j>=A[0].length || A[i][j]==0 || isVis[i][j]==true) {
            return;
        }
        if(A[i][j]==1) {
            isVis[i][j]=true;
        }
        DFS(A,isVis,i+1,j);
        DFS(A,isVis,i-1,j);
        DFS(A,isVis,i,j+1);
        DFS(A,isVis,i,j-1);
        //also diagonals 
    }
    public int solve(int[][] A) {
    boolean[][] isVis=new boolean[A.length][A[0].length];
    int c=0;
    for(int i=0;i<A.length;i++) {
        for(int j=0;j<A[0].length;j++) {
            if(A[i][j]==1) {
                if(isVis[i][j]==false) {
                    DFS(A,isVis,i,j);
                    c++;
                }
            }
        }
    }
    return c;
}
//Cycle in Undirected graph using BFS is just same as BFS traversal 
//Connnected components in a graph
public boolean isCycle(int A, int B[][]) {
    ArrayList<Integer>[] adj = new ArrayList[A+1];
    for(int i=1;i<=A;i++) {
        adj[i]=new ArrayList();
    }
    for(int[] i:B) {
        adj[i[0]].add(i[1]);
        adj[i[1]].add(i[0]);
    }
    Queue<Pair> Q=new LinkedList<>();
    boolean[] isVis=new boolean[A+1];
    while(!Q.isEmpty()) {
        Pair curr=Q.poll();
        // isVis[curr.val]=true;
        for(int i=0;i<adj[curr.val].size();i++) {
            int neighbor=adj[curr.val].get(i);
            if(!isVis[neighbor]) {
                isVis[neighbor]=true;
                Q.add(new Pair(neighbor,curr.val));
            }
            else if(neighbor!=curr.parent) {
                return true;
            }
        }
    }
    return false;
    
}

//is Cyclic using BFS in undirected graphs
public class Solution {
    class Pair{
        int val;
        int parent;
        public Pair(int val, int parent) {
            this.val=val;
            this.parent=parent;
        }
    }
    public boolean detectCycle(int src,ArrayList<Integer>[] adj,boolean isVis[],int v) {
        Queue<Pair> Q=new LinkedList<>();
        Q.add(new Pair(src,-1));
        isVis[src]=true;
        while(!Q.isEmpty()) {
            Pair curr=Q.poll();
            for(int i=0;i<adj[curr.val].size();i++) {
                int num=adj[curr.val].get(i);
                if(!isVis[num]) {
                    isVis[num]=true;
                    Q.add(new Pair(num,curr.val));
                }
                else if(curr.parent!=num) {
                    return true;
                }
            }
        }
        return false;
    }
    public int solve(int A, int[][] B) {
        //Construct Adjacency-list
        ArrayList<Integer>[] adj=new ArrayList[A+1];
        for(int i=0;i<adj.length;i++) {
            adj[i]=new ArrayList<>();
        }
        for(int[] i:B) {
            adj[i[0]].add(i[1]);
        }
        boolean[] isVis=new boolean[A+1];
        for(int i=1;i<=A;i++) {
            if(!isVis[i]) {
                if(detectCycle(i,adj,isVis,A)) {
                    return 1;
                }
            }
        }
        return 0;
        
    }
}
//iscyclic in undirected graph using DFS
public  static boolean cyclicDFS(int node, int parent, ArrayList<Integer>[] adj, boolean[] isVis) {
    isVis[node]=true;
    for(int i=0;i<adj[node].size();i++) {
        int neighbour=adj[node].get(i);
        if(isVis[neighbour]==false) {
            if(cyclicDFS(neighbour,node,adj,isVis)==true) {
                return true;
            }
        }
        else if(neighbour!=parent) {
            return true;
        }
    }
    return false;
}
public static void main(String[] args) {
    //isCyclic
    int A=5;
    int[][] B={{1,2},{2,3},{3,4},{4,5},{5,2}};
    ArrayList<Integer>[] adj=new ArrayList[A+1];
    for(int i=0;i<adj.length;i++) {
        adj[i]=new ArrayList<>();
    }
    for(int[] i:B) {
        adj[i[0]].add(i[1]);
        adj[i[1]].add(i[0]);
    }
    boolean[] isVis=new boolean[A+1];
    for(int i=1;i<=A;i++) {
        if(!isVis[i]) {
            if(cyclicDFS(i,-1,adj,isVis)) {
                System.out.println("Cyclic");
                return;
            }
        }
    }
    System.out.println("Not Cyclic");
}



        
    
}
 
