/*Implement code in java in which we have been Given an adjacency list representation undirected graph. 
Write a function to count the number of edges in the undirected graph. 
Expected time complexity : O(V) Examples:

Input : Adjacency list representation of
        below graph.  
Output : 9
Idea is based on Handshaking Lemma. Handshaking lemma is about undirected graph. 
In every finite undirected graph number of vertices with odd degree is always even. 

*/

import java.util.Vector;

class Graph {
    int v;
    Vector<Integer>[] adj;

    Graph(int V) {
        this.v = V;
        this.adj = new Vector[V];
        for (int i = 0; i < V; i++)
            adj[i] = new Vector<Integer>();
    }

    void addEdge(int u, int v) {
        adj[u].add(u);
        adj[v].add(u);
    }

    int countEdges() {
        int sum = 0;
        for (int i = 0; i < v; i++)
            sum += adj[i].size();
        return sum / 2;
    }
}

class P01_Count_edgesinUndirected_graph {
    public static void main(String[] args) {
        int V = 9;
        Graph g = new Graph(V);
        g.addEdge(0, 1);
        g.addEdge(0, 7);
        g.addEdge(1, 2);
        g.addEdge(1, 7);
        g.addEdge(2, 3);
        g.addEdge(2, 8);
        g.addEdge(2, 5);
        g.addEdge(3, 4);
        g.addEdge(3, 5);
        g.addEdge(4, 5);
        g.addEdge(5, 6);
        g.addEdge(6, 7);
        g.addEdge(6, 8);
        g.addEdge(7, 8);

        System.out.println(g.countEdges());
    }
}