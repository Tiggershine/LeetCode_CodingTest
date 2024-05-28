package Matrix;
/*
https://leetcode.com/problems/matrix-diagonal-sum/description/

Given a square matrix mat, return the sum of the matrix diagonals.
Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.

Example 1:
Input: mat = [[1,2,3],
              [4,5,6],
              [7,8,9]]
Output: 25
Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
Notice that element mat[1][1] = 5 is counted only once.

Example 2:
Input: mat = [[1,1,1,1],
              [1,1,1,1],
              [1,1,1,1],
              [1,1,1,1]]
Output: 8

Example 3:
Input: mat = [[5]]
Output: 5
 */

public class MatrixDiagonalSum {
  public int diagonalSum(int[][] mat) {
    // odd
    // (0,0)(1,1)(2,2)(3,3)(4,4)
    // (0,4)(1,3)(2,2)(3,1)(4,0)
    
    // even
    // (0,0)(1,1)(2,2)(3,3)
    // (0,3)(1,2)(2,1)(3,0)

    int result = 0;

    for (int i = 0; i < mat.length; i++) {
        result += mat[i][i];
        result += mat[i][mat.length - 1 - i];
    }
    if (mat.length % 2 == 1) {
        result -= mat[mat.length/2][mat.length/2];
    }

    return result;
  }
}
