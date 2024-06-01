package DailyQuestion;
/*
https://leetcode.com/problems/score-of-a-string/?envType=daily-question&envId=2024-06-01

 You are given a string s. The score of a string is defined as the sum of the absolute difference between the ASCII values of adjacent characters.

Return the score of s.

Example 1:
Input: s = "hello"
Output: 13

Explanation:
The ASCII values of the characters in s are: 'h' = 104, 'e' = 101, 'l' = 108, 'o' = 111. So, the score of s would be |104 - 101| + |101 - 108| + |108 - 108| + |108 - 111| = 3 + 7 + 0 + 3 = 13.
 */
public class ScoreofaString {
  public int scoreOfString(String s) {
    // (int)string => return ASCII value of string
    int result = 0;
    for (int i = 1; i < s.length(); i++) {
        result += Math.abs(s.charAt(i-1) - s.charAt(i));
    }

    return result;
}
}
