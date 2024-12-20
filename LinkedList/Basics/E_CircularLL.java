package LinkedList.Basics;

public class E_CircularLL {
    private Node head;
    private Node tail;

    public E_CircularLL() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int data) {
        Node node = new Node(data);
        if(head == null) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void display() {
        Node temp = head;
        if(head != null) {
            do {
                System.out.print(temp.data+" -> ");
                temp = temp.next;
            }while(temp != head);
        }
        System.out.println("HEAD");
    }

    public void delete(int data) {
        if(head == null) {
            return;
        }
        // if(head == tail) {
        //     head = null;
        //     tail = null;
        //     return;
        // }
        Node temp = head;
        if(temp.data == data) {//first node is to be deleted
            head  = head.next;
            tail.next = temp;
            return;
        }
        do{
            Node node = temp.next;
            if(node.data == data) {
                temp.next = node.next;
                break;
            }
            // else {
            //     temp = node;
            // }
            temp = temp.next;
        }while(temp != head);

        System.out.println("Deleted element: "+data);
    }

    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        /*
         * CIRCULAR LINKED LIST
         * tail pointing to head
         */
    }
}