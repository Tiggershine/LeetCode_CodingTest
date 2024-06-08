package DailyQuestion;
/*
https://leetcode.com/problems/continuous-subarray-sum/description/?envType=daily-question&envId=2024-06-08
 Given an integer array nums and an integer k, return true if nums has a good subarray or false otherwise.
A good subarray is a subarray where:
its length is at least two, and
the sum of the elements of the subarray is a multiple of k.
Note that:
A subarray is a contiguous part of the array.
An integer x is a multiple of k if there exists an integer n such that x = n * k. 0 is always a multiple of k.

Example 1:
Input: nums = [23,2,4,6,7], k = 6
Output: true
Explanation: [2, 4] is a continuous subarray of size 2 whose elements sum up to 6.

Example 2:
Input: nums = [23,2,6,4,7], k = 6
Output: true
Explanation: [23, 2, 6, 4, 7] is an continuous subarray of size 5 whose elements sum up to 42.
42 is a multiple of 6 because 42 = 7 * 6 and 7 is an integer.

Example 3:
Input: nums = [23,2,6,4,7], k = 13
Output: false
 */

import java.util.HashMap;

public class ContinuousSubarraySum {
  class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        // map stores (sum % k, index)
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            sum %= k;
            // case 1: sum % k = 0 && i > 0  =>  satisfy the condition of good subarray
            if (sum == 0 && i > 0) {
                return true;
            }

            // case 2: map(sum)-value exists already in map && distance of two > 1  => satisfy the condition
            if (map.containsKey(sum) && i - map.get(sum) > 1) {
                return true;
            }
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        return false;

    }
    // Time Limit Exceeded Error with the code under
    // public boolean checkSubarraySum(int[] nums, int k) {
    //     int i = 0;
    //     while (i < nums.length) {
    //         int sum = nums[i];
    //         for (int j = i + 1; j < nums.length; j++) {
    //             sum += nums[j];
    //             if (sum % k == 0) {
    //                 return true;
    //             }
    //         }
    //         i++;
    //         sum = 0;
    //     }
    //     return false;
    // }
}
}
