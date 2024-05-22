package LinkedList;

public class reverseLinkedList {
  public ListNode reverseList(ListNode head) {
    if (head == null) { return null; }

    ListNode previous = null;
    ListNode current = head;
    ListNode next = new ListNode(0);

    while (current != null) {
        next = current.next;
        current.next = previous;  // .next는 화살표 방향
        previous = current;
        current = next;
    }
    head = previous;

    return head;
}
}
