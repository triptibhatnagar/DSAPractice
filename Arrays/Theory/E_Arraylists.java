package Arrays.Theory;

import java.util.ArrayList;
import java.util.Scanner;

public class E_Arraylists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Arraylist (Dynamic array)

        //WHY WE NEED ARRAYLIST
        //when size of array is not known

        //SYNTAX
        ArrayList<Integer> list = new ArrayList<Integer>(5);
        //wrapper classes are passed

        list.add(67);
        list.add(90);
        list.add(78);
        list.add(12);
        list.add(23);
        list.add(89);
        list.add(92);
        list.add(73);
        list.add(74);
        list.add(65);

        System.out.println(list);//internally calls toString() method
        //[67, 90, 78, 12, 23, 89, 92, 73, 74, 65]

        System.out.println(list.contains(9));//false
        list.set(0, 100);
        System.out.println(list);// [100, 90, 78, 12, 23, 89, 92, 73, 74, 65]
        list.remove(3);
        System.out.println(list);// [100, 90, 78, 23, 89, 92, 73, 74, 65]
        
        
        //INPUT
        ArrayList<Integer> list2 = new ArrayList<Integer>(5);

        for (int i = 0; i < 5; i++) {
            list2.add(sc.nextInt());
        }

        //GET AN ITEM
        for (int i = 0; i < 5; i++) {
            System.out.println(list2.get(i));
        }

        System.out.println(list2);

        //working of arraylist is same as of arrays
        /*
         * size is fixed internally
         * when arraylist fills by some amount, it will create a new arraylist of maybe double the size
         * old elements are copied in new one
         * old array is deleted
        */

        //Time complexity - O(1) //amortized

        sc.close();
    }
}
