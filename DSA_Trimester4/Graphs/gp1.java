 import java.util.*;
//  ANY TYPE OF NETWORK IS CALLED GRAPH (SHOULD BE SOLVED USING GRAPH ALGORITHM )
 class Node {
    int row;
    int col;
    int dis;
    public Node(int row, int col, int dis) {
        this.row = row;
        this.col = col;
        this.dis = dis;
    }
}
public class gp1{
    //Graphs : are network of nodes connected by edges
    //Example : Social Network, Internet, Maps, DOM in HTML etc.
    // Graphs are everywhere
    //Facebook : Nodes are people, edges are friendships
    //Internet : Nodes are websites, edges are links
    //Maps : Nodes are locations, edges are roads
    //DOM : Nodes are elements, edges are parent-child relationships
    // <----------------------Graph Terminology------------------------>
    // 1. Vertex : A node in a graph
    // 2. Edge : A connection between two vertices

    // <----------------------Types of Graphs------------------------>
    //Graphs unweighted , weighted , directed , undirected
    //Graphs can be cyclic or acyclic
    //Graphs can be connected or disconnected
    // <----------------------Graph Representation------------------------>
    //For a given graph G = (V,E) where V is the set of vertices and E is the set of edges
    //There are two common ways to represent a graph
    // 1. Adjacency Matrix
    // 2. Adjacency List
    // Facebook is a undirected graph , instagram is a directed graph


    //Adjacency list using directed graphs 
    public int adjacencylist(int A, int[][] B) 
    {
        ArrayList<Integer> adj[] = new ArrayList[A+1];
        for(int i=1;i<=A;i++) {
            adj[i]=new ArrayList();
        }
        for(int[] i:B) {
            adj[i[0]].add(i[1]);
        }
        return 0; 
    }
    //Adjacency list using undirected graphs
    public int adjacencyList(int A, int[][] B) 
    {
        ArrayList<Integer> adj[] = new ArrayList[A+1];
        for(int i=1;i<=A;i++) {
            adj[i]=new ArrayList();
        }
        for(int[] i:B) {
            adj[i[0]].add(i[1]);
            adj[i[1]].add(i[0]);
        }
        return 0; 
    }
    //Adjacency Matrix using directed graphs
    public int adjacencyMatrix(int A, int[][] B) 
    {
        int adj[][] = new int[A+1][A+1];
        for(int i=0;i<B.length;i++) {
            adj[B[i][0]][B[i][1]]=1;
        }
        return 0; 
    }
    //Adjacency Matrix using undirected graphs
    public int adjacencymatrix(int A, int[][] B) 
    {
        int adj[][] = new int[A+1][A+1];
        for(int i=0;i<B.length;i++) {
            adj[B[i][0]][B[i][1]]=1;
            adj[B[i][1]][B[i][0]]=1;
        }
        return 0; 
    }

    //1
    //Single-BFS
    /*Given an un-directed graph and un-weighted given source node 
    and destination find if the path exists from (S) to destination */

    public static int shortestDistance(int A[][], int S, int D) {
        int startRow = -1, startCol = -1;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if (A[i][j] == S) {
                    startRow = i;
                    startCol = j;
                }
            }
        }
        if (startRow == -1 || startCol == -1) {
            return -1;  // Source not found in the grid
        }

        boolean[][] isVis = new boolean[A.length][A[0].length];
        Queue<Node> Q = new LinkedList<>();
        Q.add(new Node(startRow, startCol, 0));

        int[] rowDelta = {1, -1, 0, 0};
        int[] colDelta = {0, 0, 1, -1};
        while (!Q.isEmpty()) {
            Node curr = Q.poll();
            if (A[curr.row][curr.col] == D) {
                return curr.dis;
            }
            for (int i = 0; i < 4; i++) {
                int newRow = curr.row + rowDelta[i];
                int newCol = curr.col + colDelta[i];

                if (newRow >= 0 && newRow < A.length && newCol >= 0 && newCol < A[0].length &&
                    A[newRow][newCol] != 0 && !isVis[newRow][newCol]) {
                    isVis[newRow][newCol] = true;
                    Q.add(new Node(newRow, newCol, curr.dis + 1));
                }
            }
        }
        return -1; 
    }


    
    //2
    //Multiple-BFS
    class Node {
        int row;
        int col;
        int min;
        public Node(int row, int col, int min) {
            this.row = row;
            this.col = col;
            this.min = min;
        }
    }
    
    public int solve(int[][] A) {
        int n = A.length;
        int m = A[0].length;
        
        boolean[][] isVis = new boolean[n][m];
        Queue<Node> Q = new LinkedList<>();
        int freshOranges = 0;
        
        // Initialize the queue with all the rotten oranges
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (A[i][j] == 2) {
                    Q.add(new Node(i, j, 0));
                    isVis[i][j] = true;
                } else if (A[i][j] == 1) {
                    freshOranges++;
                }
            }
        }
        
        // If there are no fresh oranges, return 0
        if (freshOranges == 0) {
            return 0;
        }
        
        int[] rowDelta = {0, 0, 1, -1};
        int[] colDelta = {1, -1, 0, 0};
        int maxMinutes = 0;
        
        // Perform BFS
        while (!Q.isEmpty()) {
            Node curr = Q.poll();
            for (int i = 0; i < 4; i++) {
                int newRow = curr.row + rowDelta[i];
                int newCol = curr.col + colDelta[i];
                if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < m && A[newRow][newCol] == 1 && !isVis[newRow][newCol]) {
                    isVis[newRow][newCol] = true;
                    Q.add(new Node(newRow, newCol, curr.min + 1));
                    maxMinutes = curr.min + 1;
                    freshOranges--;
                }
            }
        }
        
        // If there are still fresh oranges, return -1
        if (freshOranges > 0) {
            return -1;
        }
        
        return maxMinutes;
    }
}






