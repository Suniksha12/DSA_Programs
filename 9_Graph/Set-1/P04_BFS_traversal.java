/*Implement a code in java to traverse the graph using BFS 
 * 
 * Time Complexity : O(V+E)
 * Space Complexity : O(V)
*/

/*
import java.util.*;
import java.util.List;

public class P04_BFS_traversal {
    static void bfs(List<List<Integer>> adj, int s) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] visisted = new boolean[adj.size()];
        visisted[s] = true;
        q.add(s);

        while (!q.isEmpty()) {
            int curr = q.poll();
            System.out.print(curr + " ");

            for (int x : adj.get(curr)) {
                if (!visisted[x]) {
                    visisted[x] = true;
                    q.add(x);
                }
            }
        }
    }

    static void addEdge(List<List<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public static void main(String[] args) {
        int V = 5;
        List<List<Integer>> adj = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 1, 4);
        addEdge(adj, 2, 4);

        System.out.println("BFS Starting from 0:");
        bfs(adj, 0);
    }
} */

/*BFS of the whole Graph which Maybe Disconnected 
 * 
 * Time Complexity : O(V+E)
 * Space Complexity : O(V)
*/

import java.util.Queue;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class P04_BFS_traversal {
    public static void bfsDisconnected(List<List<Integer>> adj) {
        boolean[] visited = new boolean[adj.size()];
        for (int i = 0; i < adj.size(); i++) {
            if (!visited[i]) {
                bfs(adj, i, visited);
            }
        }
    }

    public static void bfs(List<List<Integer>> adj, int s, boolean[] visisted) {
        Queue<Integer> q = new LinkedList<>();
        visisted[s] = true;
        q.add(s);
        while (!q.isEmpty()) {
            int curr = q.poll();
            System.out.print(curr + " ");

            for (int x : adj.get(curr)) {
                if (!visisted[x]) {
                    visisted[x] = true;
                    q.add(x);
                }
            }
        }
    }

    public static void addEdge(List<List<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(u).add(u);
    }

    public static void main(String[] args) {
        int V = 6;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 3, 4);
        addEdge(adj, 4, 5);

        bfsDisconnected(adj);
    }
}
