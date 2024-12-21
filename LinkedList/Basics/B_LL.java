package LinkedList.Basics;

public class B_LL {
    /* The head, tail, and size variables are described outside the Node class because they belong to the linked list as a whole, not to individual nodes.
     * Each node only handles its own data and a link to the next node, so these details belong to the B_LL class, which manages the whole structure.
     */
    private Node head;
    private Node tail;
    private int size;

    public B_LL() {
        this.size = 0;
    }
    /*
     * The Node class is made private so that it can only be accessed and used inside the B_LL class. This is done to:

    1) Hide Complexity: The user of the B_LL class doesn't need to know how individual nodes work; they just use the linked list as a whole.
    Example: You drive a car without needing to know how the engine works internally.

    2) Protect the Data: If the nodes were public, someone could directly change or break the connections between nodes, which could mess up the linked list.
    Example: It’s like locking your phone settings so no one can accidentally mess them up.
     */
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

    public void insertAtBeg(int element) {
        Node node = new Node(element);
        node.next = head;//for empty list, head,tail both are null, so node.next = null
        head = node;//head is updated
        if(tail == null) {//if list is empty, tail is alo updated
            tail = head;
        }
        size++;
        //tail does not change because the last node remains the same and it always point to the node whose next is null
    }

    public void insertAtEnd(int element) {
        // WITHOUT TAIL -> time complexity : O(n)
        // Node node = new Node(element);
        // node.next = null;
        // if(head == null) {
        //     head = node;
        // }
        // Node temp = head;
        // while(temp.next != null) {
        //     temp = temp.next;
        // }
        // temp.next = node;
        
        if(tail == null) {//if list is empty, insert at end is same as insert at beg
            insertAtBeg(element);
            return;
        }
        Node node = new Node(element);
        node.next = null;
        tail.next = node;
        tail = node;
        size++;
        //the benefit of tail is constant time complexity.
    }

    public void insertAtSpPos(int element, int position) {//position starting from 0
        if(position > 0 || position > size) {
            System.out.println("Position out of limits");
            return;
        }
        if(position == 0) {//list is empty
            insertAtBeg(element);
            return;
        }
        if(position == size) {// position from 0, size from 1
            // position here means at what position you need to insert an element in next LL
            // if LL of size 6-> containing 6 nodes
            // if you pass position=6, so, in next LL with size=7, the element is inserted at position=6 in this LL.
            // but you pass position=7, so, in next LL with size=7, the element is inserted at position=7(i.e. at the end) in this LL.
            insertAtEnd(element);
            return;
        }
        Node temp = head;//0
        // temp will store previous node to the given position
        for (int i = 1; i < position; i++) {//1,2
            temp = temp.next;
        }
        // Node node = new Node(element);
        // node.next = temp.next;
        // temp.next = node;
        Node node = new Node(element, temp.next);
        temp.next = node;
        size++;
    }

    public int deleteAtBeg() {
        if(head == null) {//if list is empty
            return -1;
        }
        int delVal = head.data;
        head = head.next;
        size--;
        if(head == null) {// if list is now empty, or say if there was only 1 element that gets deleted too
            tail = null;
        }
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
        System.out.println("Data don't exist");
        return null;
    }

    public Node getNodeAtPos(int position) {
        if(position > 0 || position > size) {
            System.out.println("Position out of limits");
            return null;
        }
        if(head == null) {
            return null;
        }
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
        // Node secondlast = getNodeAtPos(size-2);
        // int delVal = tail.data;
        // tail = secondlast;
        // tail.next = null;
        // size--;
        // return delVal;

        // approach 2
        Node temp = head;
        for (int i = 1; i < size-1; i++) {
            temp = temp.next;
        }
        int delVal = temp.next.data;
        temp.next = null;
        tail = temp;
        size--;
        return delVal;
    }

    public int deleteAtSpPos(int position) {//this position starting from 0
        if(position > 0 || position > size) {
            System.out.println("Position out of limits");
            return -1;
        }
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