package BinarySearch;

import java.util.Collections;
import java.util.List;

/*
https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/description/

Given a 0-indexed integer array nums of length n and an integer target, return the number of pairs (i, j) where 0 <= i < j < n and nums[i] + nums[j] < target.

Constraints:
1 <= nums.length == n <= 50
-50 <= nums[i], target <= 50
 

Example 1:
Input: nums = [-1,1,2,3,1], target = 2
Output: 3
Explanation: There are 3 pairs of indices that satisfy the conditions in the statement:
- (0, 1) since 0 < 1 and nums[0] + nums[1] = 0 < target
- (0, 2) since 0 < 2 and nums[0] + nums[2] = 1 < target 
- (0, 4) since 0 < 4 and nums[0] + nums[4] = 0 < target
Note that (0, 3) is not counted since nums[0] + nums[3] is not strictly less than the target.
 */
public class CountPairsWhoseSumisLessthanTarget {
  public int countPairs(List<Integer> nums, int target) {
    // Using binary search
    Collections.sort(nums);
        // -1,1,1,2,3
        int left = 0, right = nums.size() - 1;
        int count = 0;

        while (left < right) {
            if (nums.get(left) + nums.get(right) < target) {
                count += right - left; // all the elements btween right and left fullfill the condition
                left++;
            }
            else {
                right--; // decrement the right index
            }
        }
        return count;

        // int n = nums.size();
        // int ans = 0;
        // for (int i = 0; i < n - 1; i++) {
        //     for (int j = i + 1; j < n; j++) {
        //         if (nums.get(i) + nums.get(j) < target) {
        //             ans++;
        //         }
        //     }
        // }
        // return ans;
    }
}
