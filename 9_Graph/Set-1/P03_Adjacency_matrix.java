/*Implement code in java in which we have to Graph Adjacency Matrix
The Adjacency matrix is the way to represent the graphs using the 2D array. 
It is the fundamental data structure in the graph theory. 
It can provide efficient ways to analyze connectivity and the relationship
 within the graph.
 
Adjacency matrix in an undirected graph.*/

/*
public class P03_Adjacency_matrix {
    private boolean[][] adjacencyMatrix;
    private int numVertices;

    public P03_Adjacency_matrix(int numVertices){
        this.numVertices = numVertices;
        adjacencyMatrix = new boolean[numVertices][numVertices];
    }
    public void addEdge(int i, int j){
        adjacencyMatrix[i][j] = true;
        adjacencyMatrix[j][i] = true;
    }
    public void removeEdge(int i, int j){
        adjacencyMatrix[i][j] = false;
        adjacencyMatrix[j][i] = false;
    }
    public boolean hasEdege(int i , int j){
        return adjacencyMatrix[i][j];
    }
    public void printGraph(){
        for(int i=0;i<numVertices;i++){
            for(int j=0;j<numVertices;j++){
                System.out.println(adjacencyMatrix[i][j] ? "1":"0");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        P03_Adjacency_matrix graph = new P03_Adjacency_matrix(4);

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(1, 3);

        System.out.print("Graph Representation:" );
        graph.printGraph();

        System.out.print("chceking if there is an edge between vertices o adn 1:" + graph.hasEdege(0, 1));

        System.out.print("checking if there is and edge between vertices 0 and 3;" + graph.hasEdege(0, 3));

        graph.removeEdge(1, 2);
        System.out.print("after removing edge between vertices 1 and 2:");
        graph.printGraph();

    }
}*/

/*Adjacency matrix for directed graph In the directed graph, edges have the direction and it can 
indicating the one-way relationship between the vertices. The adjacency matrix for the directed graph 
reflects this directional aspect where the presence of the edge from vertex i to vertex j is the 
represented by the non-zero values in the (i,j) cell.*/

class DirectedGraph {
    private int[][] adjacencyMatrix;
    private int numVertices;

    public DirectedGraph(int numVertices) {
        this.numVertices = numVertices;
        adjacencyMatrix = new int[numVertices][numVertices];
    }

    public void addEdge(int source, int destination) {
        adjacencyMatrix[source][destination] = 1;
    }

    public void removeEdge(int source, int destination) {
        adjacencyMatrix[source][destination] = 0;
    }

    public boolean hasEdege(int source, int destination) {
        return adjacencyMatrix[source][destination] == 1;
    }

    public void printGraph() {
        System.out.println("Graph reprsentation");
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class P03_Adjacency_matrix {
    public static void main(String[] args) {
        DirectedGraph graph = new DirectedGraph(4);

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);

        graph.printGraph();
        System.out.println("Checking if there's an edge from vertex 2 to 0: "
                + graph.hasEdege(2, 0));

        System.out.println("Checking if there's an edge from vertex 3 to 1: "
                + graph.hasEdege(3, 1));

        graph.removeEdge(2, 0);
        System.out.println("After removing edge from vertex 2 to 0:");
        graph.printGraph();
    }
}
