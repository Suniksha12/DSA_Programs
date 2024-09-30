/*Implement a code in java in which we have Given a directed graph, 
determine if a vertex j is reachable from another vertex i for all vertex pairs 
(i, j) in the given graph. Here reachable means that there is a path from vertex i to j. 
The reach-ability matrix is called the transitive closure of a graph.  

Approach - Floyd warshell algorithm

Time Complexity : O(V^3)
Space Complexity : O(V^2)*/

public class P02_floyd_algo {
    final static int V = 4;

    void transitiveClousure(int graph[][]) {
        int reach[][] = new int[V][V];
        int i, j, k;
        for (i = 0; i < V; i++)
            for (j = 0; j < V; j++)
                reach[i][j] = graph[i][j];

        for (k = 0; k < V; k++) {
            for (i = 0; i < V; i++) {
                for (j = 0; j < V; j++) {
                    reach[i][j] = (reach[i][j] != 0) || ((reach[i][k] != 0) && (reach[k][j] != 0)) ? 1 : 0;
                }
            }
        }
        printSolution(reach);
    }

    void printSolution(int reach[][]) {
        System.out.println("Following matrix is transitive closure" +
                " of the given graph");
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                if (i == j)
                    System.out.println("1");
                else
                    System.out.println(reach[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int graph[][] = new int[][] { { 1, 1, 0, 1 },
                { 0, 1, 1, 0 },
                { 0, 0, 1, 1 },
                { 0, 0, 0, 1 }
        };
        P02_floyd_algo g = new P02_floyd_algo();
        g.transitiveClousure(graph);
    }
}
