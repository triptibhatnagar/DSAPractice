public class Sort012 {
    static void traverse(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    static ListNode sort012_brute(ListNode head) {
        if(head == null) return head;
        int zeroes = 0;
        int ones = 0;
        int twos = 0;
        ListNode temp = head;
        while (temp != null) {
            if(temp.data == 0) zeroes++;
            else if(temp.data == 1) ones++;
            else twos++;
            temp = temp.next;
        }
        System.out.println(zeroes);
        System.out.println(ones);
        System.out.println(twos);
        temp = head;
        while(zeroes>0) {
            temp.data = 0;
            temp = temp.next;
            zeroes--;
        }
        while(ones>0) {
            temp.data = 1;
            temp = temp.next;
            ones--;
        }
        while(twos>0) {
            temp.data = 2;
            temp = temp.next;
            twos--;
        }
        return head;
    }

    static ListNode sort012_opt(ListNode head) {
        // 3 dummy lists
        ListNode zeroHead = new ListNode();
        ListNode oneHead = new ListNode();
        ListNode twoHead = new ListNode();

        // 3 pointers
        ListNode zero = zeroHead;
        ListNode one = oneHead;
        ListNode two = twoHead;

        ListNode temp = head;
        while (temp != null) {
            if(temp.data == 0) {
                zero.next = temp;
                zero = zero.next;
            }else if(temp.data == 1) {
                one.next = temp;
                one = one.next;
            }else {
                two.next = temp;
                two = two.next;
            }
            temp = temp.next;
        }
        zero.next = oneHead.next != null ? oneHead.next : twoHead.next;
        one.next = twoHead.next;
        two.next = null;
        return zeroHead.next;
    }
    public static void main(String[] args) {
        ListNode head= new ListNode(1, new ListNode(0));
        head.next.next = new ListNode(2, new ListNode(0));
        head.next.next.next.next = new ListNode(1);
        traverse(head);
        // traverse(sort012_brute(head));
        traverse(sort012_opt(head));
    }
}
