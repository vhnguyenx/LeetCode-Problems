package LinkedList;

public class MiddleOfTheLinkedList {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode middleNode(ListNode head) {

        ListNode current = head;
        int length = 0;

        while (current != null) {
            length++;
            current = current.next;
        }

        int middle = length / 2 + 1;

        ListNode result = head;
        int count = 0;
        while (result != null) {
            count++;
            if(count == middle){
                return result;
            }else{
                result = result.next;
            }
        }

        return result;
    }
}
