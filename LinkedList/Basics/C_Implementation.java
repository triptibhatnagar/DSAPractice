package LinkedList.Basics;

public class C_Implementation {
    public static void main(String[] args) {
        //SINGLY LINKED LIST
        // B_LL list = new B_LL();
        // System.out.println(list.getNodeAtPos(2));
        // list.insertAtBeg(8);
        // list.insertAtBeg(7);
        // list.insertAtBeg(3);
        // list.insertAtBeg(5);
        // list.displayLL();//5 -> 3 -> 7 -> 8 -> null

        // list.insertAtEnd(10);
        // list.insertAtEnd(17);
        // list.insertAtEnd(20);
        // list.displayLL();//5 -> 3 -> 7 -> 8 -> 10 -> 17 -> 20 -> null

        // list.insertAtSpPos(23, 6);
        // list.displayLL();//5 -> 3 -> 7 -> 23 -> 8 -> 10 -> 17 -> 20 -> null

        // System.out.println("Delete at beg: "+list.deleteAtBeg());
        // list.insertAtSpPos(100, 6);
        // list.displayLL();
        // System.out.println("Delete at end: "+list.deleteAtEnd());
        // list.displayLL();
        // System.out.println("Deleted Element: "+list.deleteAtBeg());
        // list.displayLL();
        // System.out.println("Deleted Element: "+list.deleteAtEnd());
        // list.displayLL();
        // System.out.println("Deleted Element: "+list.deleteAtSpPos(3));
        // list.displayLL();
        // System.out.println(list.getNodeWithData(10));

        //DOUBLY LINKED LIST
        D_DoublyLL dll = new D_DoublyLL();
        dll.insertAtBeg(8);
        dll.insertAtBeg(7);
        dll.insertAtBeg(3);
        dll.insertAtBeg(5);
        dll.displayDLL();
        /*
        5 -> 3 -> 7 -> 8 -> null
        Print in reverse:-
        8 -> 7 -> 3 -> 5 -> null
        */

        dll.insertAtEnd(20);
        dll.insertAtEnd(23);
        dll.displayDLL();
        /*
        5 -> 3 -> 7 -> 8 -> 20 -> 23 -> null
        Print in reverse:-
        23 -> 20 -> 8 -> 7 -> 3 -> 5 -> null 
        */

        dll.insertAtSpPos(0, 3);
        dll.displayDLL();
        // dll.insertAfter(7,70);
        // dll.displayDLL();
        /*
        5 -> 3 -> 7 -> 70 -> 8 -> 20 -> 23 -> null
        Print in reverse:-
        23 -> 20 -> 8 -> 70 -> 7 -> 3 -> 5 -> null
        */

        // CIRCULAR LINKED LIST
        // E_CircularLL cll = new E_CircularLL();
        // cll.insert(90);
        // cll.insert(50);
        // cll.insert(30);
        // cll.insert(80);
        // cll.insert(100);
        // cll.display();

        // cll.delete(30);///Deleted element: 30
        // cll.display();//90 -> 50 -> 80 -> 100 -> HEAD

        // cll.delete(50);//Deleted element: 50
        // cll.display();//90 -> 80 -> 100 -> HEAD
    }
}