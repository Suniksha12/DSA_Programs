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

    // Function call to get the spiral order traversal
    List<Integer> result = spiral(matrix);

    // Print the result elements
    for (int num : result) {
        System.out.print(num + " ");
    }
    }
}
