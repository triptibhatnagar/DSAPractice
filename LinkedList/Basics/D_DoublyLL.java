package LinkedList.Basics;

public class D_DoublyLL {
    private Node head;
    //no tail
    // private int size;
    
    // public D_DoublyLL() {
    //     this.size = 0;
    // }

    public void insertAtBeg(int data) {
        Node node = new Node(data);
        node.next = head;
        node.prev = null;
        if(head != null) {
            head.prev = node;
        }
        head = node; 
    }

    public void insertAtEnd(int data) {
        Node node = new Node(data);
        Node temp = head;
        node.next = null;
        if(head == null) {//list is empty
            temp.prev = null;
            head = node;
            return;
        }
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        node.prev = temp;
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

    //insert a node after a given value of a node
    public void insertAfter(int data, int newdata) {
        Node prevNode = getNodeWithData(data);
        if(prevNode == null) {
            System.out.println("does not exist");
            return;
        }
        Node node = new Node(newdata);
        node.next = prevNode.next;
        node.prev = prevNode;
        prevNode.next = node;
        if (node.next != null) {
            node.next.prev = node;
        }
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
    private class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
        }
        // public Node(int data, Node next, Node prev) {
        //     this.data = data;
        //     this.next = next;
        //     this.prev = prev;
        // }
    }
    public static void main(String[] args) {
        /*
         * DOUBLY LL
         * consist of nodes - data, next, prev
         */
    }
}