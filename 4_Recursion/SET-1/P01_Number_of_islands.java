/*Implement Code in java in which Given a binary 2D matrix, find the number of islands. 
A group of connected 1s forms an island. For example, the below matrix contains 4 islands.

Example: 

Input: mat[][] = {{1, 1, 0, 0, 0},
                  {0, 1, 0, 0, 1},
                  {1, 0, 0, 1, 1},
                  {0, 0, 0, 0, 0},
                  {1, 0, 1, 0, 0}}
Output: 4

This is a variation of the standard problem: “Counting the number of connected components in an undirected graph”. 

Approach 1 - Using Additional Matrix

Time complexity : O(ROW x COL)
Space Complexity : O(ROW x COL)*/

/*
public class P01_Number_of_islands {
    static final int ROW =5, COL =5;
    static boolean isSafe(int M[][], int row, int col, boolean visited[][]) {
        return (row>=0) && (row<ROW) && (col >=0) && (col <COL) && (M[row][col]==1 && !visited[row][col]);
    }
    static void DFS(int M[][] , int row, int col, boolean visited[][]) {
        int rowNbr[] = new int[] {-1,-1,-1,0,0,1,1,1};
        int colNbr[] = new int[] {-1,0,1,-1,1,-1,0,1};
        visited[row][col] = true;
        for(int k =0;k<8;++k)
            if(isSafe(M, row+rowNbr[k], col+colNbr[k], visited))
                DFS(M, row+rowNbr[k], col+colNbr[k], visited);
    }
   static int countIslands(int M[][]) {
        boolean visited[][] = new boolean[ROW][COL];
        int count =0;
        for(int i=0;i<ROW;++i)
           for(int j =0;j<COL;++j)
               if(M[i][j] == 1 && !visited[i][j]) {
                DFS(M,i,j,visited);
                ++count;
               }
               return count;
    }
    public static void main(String[] args)
    throws java.lang.Exception
{
    int M[][] = new int[][] { { 1, 1, 0, 0, 0 },
                              { 0, 1, 0, 0, 1 },
                              { 1, 0, 0, 1, 1 },
                              { 0, 0, 0, 0, 0 },
                              { 1, 0, 1, 0, 1 } };
    System.out.println("Number of islands is: "
                       + countIslands(M));
}
} */

/*Approach 2 - Finding the nUmber of Islands using DFS 
 * 
 * Time Complexity : 
*/