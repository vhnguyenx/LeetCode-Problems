package LinkedList;

public class SwapNodesInPairs {

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

    public ListNode swapPairs(ListNode head) {
       
        if (head == null || head.next == null) {
            return head;
        }

        ListNode nex = head.next;
        ListNode temp = nex.next;
        head.next = swapPairs(temp);
        nex.next = head;
        return nex;
    }
}
