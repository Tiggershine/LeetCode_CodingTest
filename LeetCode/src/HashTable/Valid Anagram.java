package HashTable;

import java.util.*;

// Time complexity: O(n)
class Solution {
  public boolean isAnagram(String s, String t) {
      if (s.length() != t.length()) { return false; }  // O(1)

      Map<Character, Integer> countMap = new HashMap<>();
      
      for (char c: s.toCharArray()) {  // O(n)
          countMap.put(c, countMap.getOrDefault(c, 0) + 1);
      }

      for (char c: t.toCharArray()) {  // O(n)
          if (!countMap.containsKey(c)) {
              return false;
          }
          countMap.put(c, countMap.getOrDefault(c, 0) - 1);  // O(1)
          if (countMap.get(c) == 0) {
              countMap.remove(c);
          }
      }

      return countMap.isEmpty();  // O(1)
  }
}
