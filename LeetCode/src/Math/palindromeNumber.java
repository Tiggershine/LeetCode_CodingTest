package Math;
/* Given an integer x, return true if x is a palindrome, and false otherwise.

Example 1:
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.

Example 2:
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

Example 3:
Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome. */


public class palindromeNumber {
  // Answer without using math
  public boolean isPalindrome(int x) {
    // 121  (012)
    // -121  (0123)
    // 2112
    String stringX = String.valueOf(x);
    char[] charArrayX = stringX.toCharArray();
    int len = stringX.length();

    int i = 0;
    int j = len - 1;
    while (i < j) {
        if (charArrayX[i] != charArrayX[j]) {
            return false;
        }
        i++;
        j--;
    }
    return true;
  }
}
