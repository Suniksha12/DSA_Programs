/*Implement Code in java in which we have Kruskal’s Algorithm is a classic algorithm 
in the graph theory used to find the Minimum Spanning Tree (MST) of a connected, 
undirected graph. The MST of the graph is a subset of its edges that connects all 
the vertices together, without any cycles and with the minimum possible total edge weight. 
This is useful in various applications such as network design, circuit design and 
other scenarios where we need to minimize the cost of connecting a set of points. 

Time Complexity : O(E log E)
Space Complexity : O(E+V)*/

import java.util.*;

class Edge implements Comparable<Edge> {
    int src, dest, weight;

    public Edge(int src, int dest, int weight) {
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }

    @Override
    public int compareTo(Edge compareEdge) {
        return this.weight - compareEdge.weight;
    }
}

class Graph {
    int V, E;
    Edge[] edges;

    public Graph(int V, int E) {
        this.V = V;
        this.E = E;
        edges = new Edge[E];
    }

    int find(int[] parent, int i) {
        if (parent[i] == -1)
            return i;
        return find(parent, parent[i]);
    }

    void union(int[] parent, int x, int y) {
        int xset = find(parent, x);
        int yset = find(parent, y);
        parent[xset] = yset;
    }

    void kruskalMST() {
        Edge[] result = new Edge[V - 1];
        int e = 0;
        int i = 0;
        Arrays.sort(edges);
        int[] parent = new int[V];
        Arrays.fill(parent, -1);

        while (e < V - 1) {
            Edge next_edge = edges[i++];
            int x = find(parent, next_edge.src);
            int y = find(parent, next_edge.src);

            if (x != y) {
                result[e++] = next_edge;
                union(parent, x, y);
            }
        }
        System.out.println("edges in the MST:");
        for (i = 0; i < e; ++i)
            System.out.println(result[i].src + " - " + result[i].dest + ":" + result[i].weight);
    }
}

public class P01_Kruskals_algo {
    public static void main(String[] args) {
        int V = 4;
        int E = 5;
        Graph graph = new Graph(V, E);

        graph.edges[0] = new Edge(0, 1, 10);
        graph.edges[1] = new Edge(0, 2, 6);
        graph.edges[2] = new Edge(0, 3, 5);
        graph.edges[3] = new Edge(1, 3, 15);
        graph.edges[4] = new Edge(2, 3, 4);

        graph.kruskalMST();
    }
}