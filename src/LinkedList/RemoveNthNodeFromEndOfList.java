package LinkedList;

public class RemoveNthNodeFromEndOfList {

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

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode current = head;

        int size = 0;
        while (current != null) {
            current = current.next;
            size++;
        }

        current = head;

        int location = size - n;
        // 2. Nếu xóa head
        if (location == 0) {
            return head.next;
        }

        ListNode prev = null;

        for (int i = 0; i < location; i++) {
            prev = current;
            current = current.next;
        }

        prev.next = current.next;

        return head;
    }
}
