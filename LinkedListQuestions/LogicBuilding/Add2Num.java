class ListNode {
    int data;
    ListNode next;
    ListNode(int data, ListNode next) {
        this.data = data;
        this.next = next;
    }
    ListNode(int data) {
        this.data = data;
        this.next = null;
    }
    ListNode() {
        this.data = 0;
        this.next = null;
    }
}

public class Add2Num {
    static void traverse(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    static ListNode add2Num(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode();
        ListNode temp = dummyHead;
        int carry = 0;
        while (l1 != null || l2 !=null || carry != 0) {
            int sum = 0;
            if (l1 != null) {
                sum += l1.data;
                l1 = l1.next;
            }
            if(l2 != null) {
                sum += l2.data;
                l2 = l2.next;
            }
            sum += carry;
            carry = sum / 10;// access sec last num
            ListNode node = new ListNode(sum % 10);// access last num
            temp.next = node;
            temp = temp.next;
        }
        return dummyHead.next;
    }
    public static void main(String[] args) {
        ListNode head1 = new ListNode(4);
        head1.next = new ListNode(5, (new ListNode(9)));
        traverse(head1);

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2, (new ListNode(3)));
        traverse(head2);

        traverse(add2Num(head1, head2));
    }
}
