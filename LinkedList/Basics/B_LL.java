package LinkedList.Basics;

public class B_LL {
    private Node head;
    private Node tail;
    private int size;

    public B_LL() {
        this.size = 0;
    }

    public void insertAtBeg(int element) {
        Node node = new Node(element);
        node.next = head;
        head = node;
        if(tail == null) {//if list is empty
            tail = head;
        }
        size++;
        //tail does not change because the last node remains the same and it always point to the node whose next is null
    }

    public void insertAtEnd(int element) {
        // WITHOUT TAIL -> time complexity : O(n)
        // Node node = new Node(element);
        // Node temp = head;
        // while(temp.next != null) {
        //     temp = temp.next;
        // }
        // temp.next = node;
        // node.next = null;
        if(tail == null) {//if list is empty
            insertAtBeg(element);
            return;
        }
        Node node = new Node(element);
        tail.next = node;
        tail = node;
        size++;
        //the benefit of tail is constant time complexity.
    }

    public void insertAtSpPos(int element, int position) {//position starting from 0
        if(position == 0) {//list is empty
            insertAtBeg(element);
            return;
        }
        if(position == size) {
            insertAtEnd(element);
            return;
        }
        Node temp = head;//0
        for (int i = 1; i < position; i++) {//1,2
            temp = temp.next;
        }
        // Node node = new Node(element);
        // Node nextnode = temp.next;
        // temp.next = node;
        // node.next = nextnode;

        Node node = new Node(element, temp.next);
        temp.next = node;
        size++;
    }

    public int deleteAtBeg() {
        if(head == null) {
            tail = null;
            size--;
            return -1;
        }
        int delVal = head.data;
        head = head.next;
        
        size--;
        return delVal;
    }

    public Node getNodeWithData(int data) {
        Node temp = head;
        while(temp != null) {
            if(temp.data == data) {
                return temp;
            }else {
                temp = temp.next;
            }
        }
        return null;
    }

    public Node getNodeAtPos(int position) {
        Node temp = head;
        for (int i = 0; i < position; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public int deleteAtEnd() {
        if(size <= 1) {
            return deleteAtBeg();
        }
        Node secondlast = getNodeAtPos(size-2);
        int delVal = tail.data;
        tail = secondlast;
        tail.next = null;
        size--;
        return delVal;
    }

    public int deleteAtSpPos(int position) {//this position starting from 0
        if(position == 0) {
            return deleteAtBeg();
        }
        if(position == size-1) {
            return deleteAtEnd();
        }
        Node prevNode = getNodeAtPos(position-1);
        int delVal = prevNode.next.data;
        prevNode.next = prevNode.next.next;
        size--;
        return delVal;
    }
    public void displayLL() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    private class Node {//don't want anyone to access these directly, hence private
        private int data;
        private Node next;//next is a reference variable for next node

        public Node(int data) {
            this.data = data;
        }
        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        // LinkedList<Integer> list = new LinkedList<>();
        // list.add(34);
    }
}
/*
Encapsulation: The InnerClass is private, so it cannot be accessed directly from outside the OuterClass.
Access Control: Only methods within the OuterClass can create instances of InnerClass and call its methods.
Usage: This is often used to hide implementation details and helper classes that are not intended to be part of the public API of the outer class.

In Java, when you declare a private class as a nested class within a public class, it means that the private nested class is only accessible within the enclosing public class. This can be useful for encapsulating helper classes that should not be exposed outside of the enclosing class.
*/