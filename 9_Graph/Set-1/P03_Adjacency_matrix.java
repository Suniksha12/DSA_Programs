/*Implement code in java in which we have to Graph Adjacency Matrix
The Adjacency matrix is the way to represent the graphs using the 2D array. 
It is the fundamental data structure in the graph theory. 
It can provide efficient ways to analyze connectivity and the relationship
 within the graph.
 
Adjacency matrix in an undirected graph.*/

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
}
