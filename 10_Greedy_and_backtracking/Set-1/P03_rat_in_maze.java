/*Implement code in java in which we have a rat in a maze with multiple steps or jumps allowed.
 * 
 * Approach - Backtracking algorithm
 * 
 * Time Complexity : O(2^(n^2))
 * Space Complexity : O(n^2)
 */

public class P03_rat_in_maze {
    static int N=4;
    static void printSolution(int sol[][]) {
        for(int i=0;i<N;i++) {
            for(int j=0;j<N;j++){
                System.out.printf("%d",sol[i][j]);
            }
            System.out.printf("\n");
        }
    }
    static boolean isSafe(int maze[][] , int x , int y) {
        if(x>=0 && x<N && y>=0 && y<N && maze[x][y]!=0){
            return true;
        }
        return false;
    }
    static boolean solveMaze(int maze[][]) {
        int sol[][] = {{0, 0, 0, 0}, 
                       {0, 0, 0, 0}, 
                       {0, 0, 0, 0}, 
                       {0, 0, 0, 0}}; 
        if(solveMazeUtil(maze,0,0,sol)==false){
            System.out.printf("Solution doesnt exist");
            return false;
        }
        printSolution(sol);
        return true;
    }
    static boolean solveMazeUtil(int maze[][],int x, int y , int sol[][]) {
          if(x==N-1 && y==N-1){
            sol[x][y] = 1;
            return true;
          }
          if(isSafe(maze, x, y)==true){
            sol[x][y]=1;
            for(int i=1;i<=maze[x][y] && i<N;i++){
                if(solveMazeUtil(maze,x+i,y,sol)==true){
                    return true;
                }
                if(solveMazeUtil(maze, x, y+i, sol)==true){
                    return true;
                }
            }
            sol[x][y]=0;
            return false;
          }
          return false;
    }
    public static void main(String[] args) {
        int maze[][] = {{2, 1, 0, 0}, 
                        {3, 0, 0, 1}, 
                        {0, 1, 0, 1}, 
                        {0, 0, 0, 1}}; 
        solveMaze(maze);
    }
}
