package Arrays.Theory;

import java.util.ArrayList;
import java.util.Scanner;

public class F_MultiDimAL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        //initialization
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        //add elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {//get the arraylist at idx i
                list.get(i).add(sc.nextInt());
            }
        }

        System.out.println(list);//[[1, 2, 3], [4, 5, 6], [7, 8, 9]]

        sc.close();
    }
}
