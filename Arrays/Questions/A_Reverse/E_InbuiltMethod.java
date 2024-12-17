package A_Reverse;

import java.util.ArrayList;
import java.util.Collections;

public class E_InbuiltMethod {
    public static void main(String[] args) {
        //TIME COMPLEXITY - O(N)
        //SPACE COMPLEXITY - O(1)
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Original array: "+list);
        Collections.reverse(list);
        System.out.println("Reversed array: "+list);
    }
}