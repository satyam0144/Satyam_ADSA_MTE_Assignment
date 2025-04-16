// Remove the n-th node from the end of a singly linked list.

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}
public class question26 {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        if (n == length) {
            return head.next;
        }
        temp = head;
        for (int i = 1; i < length - n; i++) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }

        return head;
    }
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        System.out.println("List:");
        printList(head);
        head = removeNthFromEnd(head, 2);
        System.out.println("After Removing 2nd Node From End:");
        printList(head);
    }
}