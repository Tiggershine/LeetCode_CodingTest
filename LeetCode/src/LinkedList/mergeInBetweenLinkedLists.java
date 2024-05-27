package LinkedList;
public class mergeInBetweenLinkedLists {
  /*
   You are given two linked lists: list1 and list2 of sizes n and m respectively. Remove list1's nodes from the ath node to the bth node, and put list2 in their place. The blue edges and nodes in the following figure indicate the result:
   https://leetcode.com/problems/merge-in-between-linked-lists/description/

   Example 1:
   Input: list1 = [10,1,13,6,9,5], a = 3, b = 4, list2 = [1000000,1000001,1000002]
   Output: [10,1,13,1000000,1000001,1000002,5]
   Explanation: We remove the nodes 3 and 4 and put the entire list2 in their place. The blue edges and nodes in the above figure indicate the result.
   */

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
      ListNode current = list1;
      ListNode next = new ListNode(0);
      int index = 0;

      while (index < a - 1) {  // < 2
          current = current.next;  // current: 2th
          index++;  // index: 1
      }
      next = current.next;  // next: 3th
      index++; // index: 2

      while (index < b + 1) {  // < 5
          next = next.next;  // next: 5th
          index++;  // index: 4
      }

      current.next = list2;
      current = list2;
      while (current.next != null) {
          current = current.next;
      }
      current.next = next;

      return list1;
    } 
}
