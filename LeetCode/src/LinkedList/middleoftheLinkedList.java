package LinkedList;
/*
Given the head of a singly linked list, return the middle node of the linked list.
If there are two middle nodes, return the second middle node.

Example 1
Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3.

Example 2
Input: head = [1,2,3,4,5,6]
Output: [4,5,6]
Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.
 */

public class middleoftheLinkedList {
    public ListNode middleNode(ListNode head) {
      ListNode current = head;
      int middle = size(head) / 2 + 1;  // middle: 3
      int index = 1;
      while (index < middle) {  // 1,2,3,4,5
          current = current.next;
          index++;
      }
      head = current;
      
      return head;
    }

    public int size(ListNode head) {
        if (head == null) return 0;

        ListNode current = head;
        int result = 1;

        while (current.next != null) {
            current = current.next;
            result++;
        }

        return result;
    }
}
