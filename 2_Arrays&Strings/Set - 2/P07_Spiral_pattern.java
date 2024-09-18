/*Implement Code in jaav sich that we are Given an m x n matrix, the task is to print all elements of the matrix in spiral form.
 * 
 *  matrix = {{1,    2,   3,   4},
              {5,    6,   7,   8},
              {9,   10,  11,  12},
            {13,  14,  15,  16 }}
Output: 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 

Approach 1- Visited Matrix 

Time Complexity : O(m*n)
Space Complexity : O(m*n)
 */

/* 
import java.util.ArrayList;
import java.util.List;

public class P07_Spiral_pattern {
    public static List<Integer> spiral(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> result = new ArrayList<>();
        if(m == 0)
           return result;

        boolean[][] seen = new boolean[m][n];

        int[] dr = {0,1,0,-1};
        int[] dc = {1,0,-1,0};
        int  r=0,c=0;
        int di =0;

        for(int i =0;i<m*n;i++) {
            result.add(matrix[r][c]);
            seen[r][c] = true;
            int newr = r + dr[di];
            int newc = c + dc[di];

            if(0 <= newr && newr < m && 0 <= newc && newc < n && !seen[newr][newc]) {
                r = newr;
                c = newc;
            } else {
                di = (di+1) % 4;
                r += dr[di];
                c += dc[di];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[][] matrix = {
            { 1, 2, 3, 4 },
            { 5, 6, 7, 8 },
            { 9, 10, 11, 12 },
            { 13, 14, 15, 16 }
    };

    List<Integer> result = spiral(matrix);

    for (int num : result) {
        System.out.print(num + " ");
    }
    }
} */

/* Approach - 2 Boundary Traversal
 * 
 * Time Complexity : O(m*n)
 * Space Complexity : O(1)
 */

 public class P07_Spiral_pattern {
    public static void spiralPrint(int m, int n, int[][] a) {
        int top =0, bottom = m-1, left =0, right = n-1;
        while(top <= bottom && left <= right) {
            for(int i = left;i<=right;++i) {
                System.out.print(a[top][i] + " ");
            }
            top++;
            for(int i = top ; i<=bottom;++i) {
                System.out.print(a[i][right] + " ");
            }
            right--;
            if(top <= bottom) {
                for(int i = right;i>=left;--i) {
                    System.out.print(a[bottom][i] + " ");
                }
                bottom--;
            }
            if(left <= right) {
                for(int i =bottom;i>=top;--i) {
                    System.out.print(a[i][left] + " ");
                }
                left++;
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, 4 },
                           { 5, 6, 7, 8 },
                           { 9, 10, 11, 12 },
                           { 13, 14, 15, 16 } };

        spiralPrint(matrix.length, matrix[0].length,
                    matrix);
    }
}