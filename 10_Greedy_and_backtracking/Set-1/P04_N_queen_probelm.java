/*Implement Code in java in which we have to What is N-Queen problem?
The N Queen is the problem of placing N chess queens on an N×N chessboard so that no two queens attack each other.

Approach- Backtracking
Time Complexity : O(N!)
Space Complexity : O(N^2)
*/

public class P04_N_queen_probelm {
    final int N = 4;

    void printSolution(int board[][]) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (board[i][j] == 1)
                    System.out.println("Q");
                else
                    System.out.println(". ");
            }
            System.out.println();
        }
    }

    boolean issafe(int board[][], int row, int col) {
        int i, j;
        for (i = 0; i < col; i++)
            if (board[row][i] == 1)
                return false;
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;
        for (i = row, j = col; j >= 0 && i < N; i++, j--)
            if (board[i][j] == 1)
                return false;
        return true;
    }

    boolean solevNQUtil(int board[][], int col) {
        if (col >= N)
            return true;
        for (int i = 0; i < N; i++) {
            if (issafe(board, i, col)) {
                board[i][col] = 1;
                if (solevNQUtil(board, col + 1) == true)
                    return true;
                board[i][col] = 0;
            }
        }
        return false;
    }

    boolean solveNQ() {
        int board[][] = { { 0, 0, 0, 0 },
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 } };
        if (solevNQUtil(board, 0) == false) {
            System.out.print("Solution does not exist");
            return false;
        }

        printSolution(board);
        return true;
    }

    public static void main(String args[]) {
        P04_N_queen_probelm Queen = new P04_N_queen_probelm();
        Queen.solveNQ();
    }
}