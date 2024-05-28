package Matrix;
/*
https://leetcode.com/problems/largest-local-values-in-a-matrix/description/

You are given an n x n integer matrix grid.
Generate an integer matrix maxLocal of size (n - 2) x (n - 2) such that:
maxLocal[i][j] is equal to the largest value of the 3 x 3 matrix in grid centered around row i + 1 and column j + 1.
In other words, we want to find the largest value in every contiguous 3 x 3 matrix in grid.
Return the generated matrix.

Example 1
Input: grid = [[9,9,8,1],[5,6,2,6],[8,2,6,4],[6,2,2,2]]
Output: [[9,9],[8,6]]
Explanation: The diagram above shows the original matrix and the generated matrix.
Notice that each value in the generated matrix corresponds to the largest value of a contiguous 3 x 3 matrix in grid.

Example 2
Input: grid = [[1,1,1,1,1],[1,1,1,1,1],[1,1,2,1,1],[1,1,1,1,1],[1,1,1,1,1]]
Output: [[2,2,2],[2,2,2],[2,2,2]]
Explanation: Notice that the 2 is contained within every contiguous 3 x 3 matrix in grid.
 */

public class LargestLocalValuesinaMatrix {
  public int[][] largestLocal(int[][] grid) {
    int localSize = grid.length - 2;
    int [][] result = new int[localSize][localSize];

    // (0,0) (0,1) (0,2)  (1,0) (1,1) (1,2)  (2,0) (2,1) (2,2) -> (0,0)
    // (0,1) (0,2) (0,3)  (1,1) (1,2) (1,3)  (2,1) (2,2) (2,3) -> (0,1)
    // (1,0) (1,1) (1,2)  (2,0) (2,1) (2,3)  (3,0) (3,1) (3,2) -> (1,0)
    // (1,1) (1,2) (1,3)  (2,1) (2,2) (2,3)  (3,1) (3,2) (3,3) -> (2,0)

    // (0,0) (0,1)
    // (1,0) (1,1)
    for (int i = 0; i < grid.length - 2; i++) {
        for (int j = 0; j < grid.length - 2; j++) {
            int max = 0;
            for (int k = i; k < i + 3; k++) {
                for (int l = j; l < j + 3; l++) {
                    if (grid[k][l] > max) {
                        max = grid[k][l];
                    }
                }
            }
            result[i][j] = max;
        }
    }
    
    return result;
}
}
