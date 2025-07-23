public class RemoveNFromBack {
    static void traverse(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    static ListNode removeNthFromBack_brute(ListNode head, int n) {
        if(head == null) return head;
        ListNode temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        // for wrap up, if there
        // n = n%size;
        // if(n < 1) {
        //     System.out.println("Nothing to delete");
        //     return head;
        // }
        if(size == n) {
            head = head.next;
            return head;
        }
        // for not wrapping up, this if block will be written
        if(size < n) {
            System.out.println("Can't delete!!! node to get deleted is exceeding the size of list");
            return head;
        }
        int steps = size-n;
        temp = head;
        while (steps > 0) {
            steps--;
            if(steps == 0) break;
            temp = temp.next;// temp pointing to prev node
        }
        temp.next = temp.next.next;
        return head;
    }

    static ListNode removeNthFromBack_opt(ListNode head, int n) {
        // fast ptr = n steps ahead of slow ptr
        // when fast reaches last node, slow is at the prev of the node to get deleted
        ListNode fast = head;
        ListNode slow = head;
        for(int i=0; i<n; i++) {
            fast = fast.next;
        }
        if(fast == null) {
            head = head.next;
            return head;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }


    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        int n = 2;
        traverse(head);
        traverse(removeNthFromBack_brute(head, n));
        traverse(removeNthFromBack_opt(head, n));
    }
}