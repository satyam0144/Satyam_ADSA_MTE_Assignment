//  Find the node where two singly linked lists intersect.

class ListNode1 {
    int val;
    ListNode next;
    ListNode1(int val) {
        this.val = val;
        this.next = null;
    }
}
 class question27 {

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode currentA = headA;
        while (currentA != null) {
            ListNode currentB = headB;
            while (currentB != null) {
                if (currentA == currentB) {
                    return currentA;
                }
                currentB = currentB.next;
            }
            currentA = currentA.next;
        }
        return null;
    }
    public static void printResult(ListNode result) {
        if (result != null) {
            System.out.println("Intersected at '" + result.val + "'");
        } else {
            System.out.println("No intersection.");
        }
    }
    public static void main(String[] args) {
        ListNode intersect = new ListNode(8);
        intersect.next = new ListNode(4);
        intersect.next.next = new ListNode(5);
        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        headA.next.next = intersect;
        ListNode headB = new ListNode(5);
        headB.next = new ListNode(6);
        headB.next.next = new ListNode(1);
        headB.next.next.next = intersect;
        ListNode result = getIntersectionNode(headA, headB);
        printResult(result);
    }
}