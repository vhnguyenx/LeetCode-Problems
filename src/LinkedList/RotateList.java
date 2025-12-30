package LinkedList;

public class RotateList {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null || k == 0) {
            return head;
        }

        ListNode prev = null;
        ListNode current = head;
        int length = 0;

        while (current != null) {
            prev = current;
            current = current.next;
            length++;
        }

        current = head;
        prev.next = current;

        int rotate = k % length;

        int location = length - rotate;

        for (int i = 0 ; i < location; i++){
            prev = current;
            current = current.next;
        }

        prev.next = null;

        return current;
    }
}
