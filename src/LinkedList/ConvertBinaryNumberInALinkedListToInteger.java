package LinkedList;

public class ConvertBinaryNumberInALinkedListToInteger {
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

    public int getDecimalValue(ListNode head) {
        StringBuilder binaryNumber = new StringBuilder();

        ListNode current = head;

        while (current != null) {
            binaryNumber.append(current.val);
            current = current.next;
        }

        return Integer.parseInt(binaryNumber.toString(), 2);
    }
}
