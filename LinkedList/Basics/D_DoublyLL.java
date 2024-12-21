package LinkedList.Basics;

public class D_DoublyLL {
    private Node head;
    //no tail
    // private int size;
    
    // size is not actually used generally, but can be written
    // public D_DoublyLL() {
    //     this.size = 0;
    // }

    private class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
        }

        // this is not required as generally while creating a node , we add the elements and update its next or prev by ourselves.
        // public Node(int data, Node next, Node prev) {
        //     this.data = data;
        //     this.next = next;
        //     this.prev = prev;
        // }
    }

    public void insertAtBeg(int data) {
        Node node = new Node(data);
        node.next = head;
        node.prev = null;
        if(head != null) {
            head.prev = node;
        }
        head = node;
        return;
    }

    public void insertAtEnd(int data) {
        if(head == null) {
            insertAtBeg(data);
            return;
        }
        Node node = new Node(data);
        Node temp = head;
        node.next = null;
        // if(head == null) {// list is empty
        //     temp.prev = null;
        //     head = node;
        //     return;
        // }
        while(temp.next != null) {
            temp = temp.next;
        }
        node.prev = temp;
        temp.next = node;
    }

    public void insertAtSpPos(int data, int position) {
        Node node = new Node(data);
        Node temp = head;
        for (int i = 1; i < position; i++) {
            temp = temp.next;
        }
        node.prev = temp;
        node.next = temp.next;
        temp.next.prev = node;
        temp.next = node;
        return;
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

    //insert a node after a given value of a node with given data
    public void insertAfter(int data, int newdata) {
        Node prevNode = getNodeWithData(data);
        if(prevNode == null) {
            System.out.println("data does not exist");
            return;
        }
        Node node = new Node(newdata);
        node.next = prevNode.next;
        node.prev = prevNode;
        prevNode.next = node;
        if (node.next != null) {//if position is last, then node is inserted at end and node.next = null
            node.next.prev = node;
        }
    }

    //insert a node after a given value of a node with given position
    public void insertAfterthisPos(int data, int position) {
        Node node = new Node(data);
        Node temp = head;
        for (int i = 0; i < position; i++) {
            temp = temp.next;
        }
        node.prev = temp;
        node.next = temp.next;
        temp.next.prev = node;
        temp.next = node;
        return;
    }

    public void displayDLL() {
        Node temp = head;
        Node last = null;
        while(temp != null) {
            System.out.print(temp.data+" -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("null");

        System.out.println("Print in reverse:-");
        while(last != null) {
            System.out.print(last.data+" -> ");
            last = last.prev;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        /*
         * DOUBLY LL
         * consist of nodes - data, next, prev
         */
    }
}