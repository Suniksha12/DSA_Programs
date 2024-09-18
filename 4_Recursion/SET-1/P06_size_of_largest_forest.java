/* Given an undirected acyclic graph having N nodes and M edges, the task is to find the size of the largest tree in the forest formed by the graph. 

A forest is a collection of disjoint trees. In other words, we can also say that forest is a collection of an acyclic graph which is not connected.

Examples:  

Input: N = 5, edges[][] = {{0, 1}, {0, 2}, {3, 4}} 
Output: 3 
Explanation: 
There are 2 trees, each having size 3 and 2 respectively. 

   0
 /   \
1     2
and  

3
 \
  4
Hence the size of the largest tree is 3.

Time Complexity : O(V+E) */

import java.util.Vector;

public class P06_size_of_largest_forest {
    static void addEdge(Vector<Integer> adj[], int u , int v) {
        adj[u].add(v);
        adj[v].add(u);
    }
    static int DFSutil(int u, Vector<Integer> adj[], Vector<Boolean> visited){
        visited.add(u,true);
        int sz = 1;
        for(int i =0;i<adj[u].size();i++)
            if(visited.get(adj[u].get(i))==false)
               sz += DFSutil(adj[u].get(i),adj,visited);
        return sz;
    }
    static int largestTree(Vector<Integer> adj[],int V) {
        Vector<Boolean> visited = new Vector<>();
        for(int i =0;i<V;i++) {
            visited.add(false);
        }
        int answer =0;
        for(int u =0;u<V;u++) {
            if(visited.get(u)==false) {
                answer = Math.max(answer, DFSutil(u,adj,visited));
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int V =5;
        Vector<Integer> adj[] = new Vector[V];
        for(int i =0;i<adj.length;i++)
            adj[i] = new Vector<Integer>();
        addEdge(adj,0,1);
        addEdge(adj,0,2);
        addEdge(adj,3,4);
        System.out.print(largestTree(adj, V));
    }
}
