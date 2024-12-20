package LinkedList.Basics;

public class A_Intro {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        arr[5] = 9;//ArrayIndexOutOfBoundsException
        //LIMITATIONS OF ARRAY/ARRAYLIST
        /*
         * Internally, in java, array is not continuous memory allocation but in general, we term array as continuous memory allocation
         * if an array is full, we can't add more elem to same array
         * arraylist can add new elements but it is not really cool.
         */
        //LINKED LIST
        /*
         * no continuous memory allocation(its not like ll[0], ll[1],...etc), different memory locations are connected
         * consist of nodes -> its value and address of next node
         * Singly Linked List : every single item knows about next item
         * head, tail -> reference variables, head -> pointing to first node and tail -> pointing to last node
         * last node points to null
         * problem : can't directly access by index
         */
    }
}