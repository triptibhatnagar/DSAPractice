import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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

public class Palindrome {
    static void traverse(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    // T: O(N+N), S: O(N)
    static List<Integer> llToList(ListNode head) {
        ListNode temp = head;
        List<Integer> list = new ArrayList<>();
        while(temp != null) {
            list.add(temp.data);
            temp = temp.next;
        }
        return list;
    }
    static boolean isPalindrome_brute1(ListNode head) {
        List<Integer> list = llToList(head);
        int s = 0;
        int e = list.size()-1;
        while (s < e) {
            if(list.get(s) != list.get(e)) {
                return false;
            }
            s++;e--;
        }
        return true;
    }

    // T: O(N+N), S: O(N)
    static boolean isPalindrome_brute2(ListNode head) {
        Stack<Integer> st = new Stack<>();
        ListNode temp = head;
        while (temp != null) {
            st.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        while (temp != null) {
            int top = st.pop();
            if (top != temp.data) {
                return false;
            }
            temp = temp.next;
        }
        return true;
    }
    
    
    // T: O(n/2 + n/2 + n/2 + n/2) : mid, rev, checking first and second, rev
    // S: O(1)
    static ListNode reverseLL(ListNode head) {
        // base case
        if(head == null || head.next == null) {
            return head;
        }
        // fxn calls will take place till last node, so at end, lastnode stored on newHead
        ListNode newHead = reverseLL(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next = null;
        return newHead;
    }

    static boolean isPalindrome_opt(ListNode head) {
        if(head == null || head.next == null) {
            return true;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next != null && fast.next.next != null) {
            // here we do not checked fast != null && fast.next != null because we want the first mid in case of even, not the second mid
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode newHead = reverseLL(slow.next);
        ListNode first = head;
        ListNode second = newHead;
        while(second != null) {
            if(first.data != second.data) {
                reverseLL(newHead);
                return false;
            }
            first = first.next;
            second = second.next;
        }
        reverseLL(newHead);
        return true;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2, new ListNode(1, new ListNode(1, new ListNode(1))));
        traverse(head);
        System.out.println(isPalindrome_brute1(head));
        System.out.println(isPalindrome_brute2(head));
        System.out.println(isPalindrome_opt(head));
    }
}