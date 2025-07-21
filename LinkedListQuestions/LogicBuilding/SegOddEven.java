import java.util.ArrayList;
import java.util.List;

public class SegOddEven {
    static void traverse(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    static ListNode segOddEven_brute(ListNode head) {
        if (head == null) {
            return head;
        }
        List<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while (temp != null && temp.next != null) {
            list.add(temp.data);
            temp = temp.next.next;
        }
        if (temp != null) {
            list.add(temp.data);
        }
        temp = head.next;
        while (temp != null && temp.next != null) {
            list.add(temp.data);
            temp = temp.next.next;
        }
        if (temp != null) {
            list.add(temp.data);
        }
        temp = head;
        int i = 0;
        System.out.println(list);
        while (temp != null) {
            temp.data = list.get(i);
            temp = temp.next;
            i++;
        }
        return head;
    }

    static ListNode segOddEven_opt(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode firstEven  = head.next;
        // odd is already behind even, so better to check for even only
        while (even != null && even.next != null) {
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }
        odd.next = firstEven;//connected
        return head;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2));
        head.next.next = new ListNode(3, new ListNode(4));
        head.next.next.next.next = new ListNode(5);
        
        // ListNode head = null;
        // traverse(head);
        // traverse(segOddEven_brute(head));

        traverse(segOddEven_opt(head));
    }
}