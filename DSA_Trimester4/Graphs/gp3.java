import java.util.*;
public class gp3 {
//1 Given a graph find weather ut us bi-partite or not?
//This solves into if cycle has oddlength then it is not bi-partite
//If cycle has even length then it is bi-partitep

public boolean isBipartiteUtil(int node, ArrayList<ArrayList<Integer>>adj, int color[]) {
    if(color[node]==-1) {
        color[node]=1;
    }
    for(int it:adj.get(node)) {
        if(color[it]==-1) {
            color[it]=1-color[node];
            if(!isBipartiteUtil(it,adj,color)) {
                return false;
            }
        } else if(color[it]==color[node]) {
            return false;
        }
    }
    return true;
}
public boolean isBipartite(int V, ArrayList<ArrayList<Integer>>adj) {
    int color[]=new int[V];
    Arrays.fill(color,-1);
    for(int i=0;i<V;i++) {
        if(color[i]==-1) {
            if(!isBipartiteUtil(i,adj,color)) {
                return false;
            }
        }
    }
    return true;
}



//2 Maximize the number of edges in the given graph such that the resulting is bi-partite
//3 
//4 Topological sort

//A bi-partite graph has chromatic nuumber 2!
//A graph is bi-partite if it can be coloured with 2 colours such that no 2 adjacent nodes have the same colour!

}

