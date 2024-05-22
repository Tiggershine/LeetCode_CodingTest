package TwoPointer;
/*
[Two Pointer]
 A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
 Given a string s, return true if it is a palindrome, or false otherwise.

 
Example 1:
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

Example 2:
Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.

Example 3:
Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
 */

 class Solution {
  public boolean isPalindrome(String s) {
      if (s.length() == 0 || s.length() == 1) { return true; }
      String cleanedString = s.replaceAll("[^a-zA-Z0-9]", "");
      cleanedString = cleanedString.toLowerCase();
      char[] charArrayS = cleanedString.toCharArray();

      // 01234 - 0,1 / 4,3 (length/2-1)
      // 0123  - 0,1 / 3,2 (length/2-1)
      int i = 0;  
      int j = charArrayS.length - 1;

      // 01234567
      // raceacar
      while (i < charArrayS.length/2) {
          if (charArrayS[i] != charArrayS[j]) {
              return false;
          }
          i += 1;
          j -= 1;
      }
      return true;
  }
}
