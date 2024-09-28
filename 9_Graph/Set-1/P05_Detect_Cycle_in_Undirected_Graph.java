/*Implement Code in java in which we have to Detect cycle in an undirected graph.
Given an undirected graph, The task is to check if there is a cycle in the given graph.

Input: V = 4, E = 4


Input-Undirected-Graph
Undirected Graph with 4 vertices and 4 edges

Output: Yes 
Explanation: The diagram clearly shows a cycle 0 to 2 to 1 to 0

Approach - Using DFS traversal 
Time Complexity : O(V+E)
Space Complexity : O(V)*/

import java.util.List;
import java.util.ArrayList;

public class P05_Detect_Cycle_in_Undirected_Graph {
    static boolean isCyclicUtil(int v, List<List<Integer>> adj, boolean[] visited, int parent) {
        visited[v] = true;
        for (int i : adj.get(v)) {
            if (!visited[i]) {
                if (isCyclicUtil(i, adj, visited, v))
                    return true;
            } else if (i != parent)
                return true;
        }
        return false;
    }

    static boolean isCyclic(int V, List<List<Integer>> adj) {
        boolean[] visisted = new boolean[V];
        for (int u = 0; u < V; u++) {
            if (!visisted[u]) {
                if (isCyclicUtil(u, adj, visisted, -1))
                    ;
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int V = 3;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(1).add(0);
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(2).add(0);
        adj.get(1).add(2);
        adj.get(2).add(1);

        System.out.println(isCyclic(V, adj) ? "Contains cycle" : "No Cycle");

        V = 3;
        List<List<Integer>> adj2 = new ArrayList<>(V);

        for (int i = 0; i < V; i++) {
            adj2.add(new ArrayList<>());
        }

        adj2.get(0).add(1);
        adj2.get(1).add(0);
        adj2.get(1).add(2);
        adj2.get(2).add(1);

        System.out.println(isCyclic(V, adj2) ? "Contains Cycle" : "No Cycle");
    }
}
