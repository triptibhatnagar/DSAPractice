package Arrays.Theory;

import java.util.Arrays;

public class C_PassingInFunc {
    public static void main(String[] args) {
        int nums[] = {8,7, 6, 5, 4};
        System.out.println(Arrays.toString(nums));//[8, 7, 6, 5, 4]
        change(nums);
        System.out.println(Arrays.toString(nums));//[99, 7, 6, 5, 4] => Arrays are MUTABLE in java
    }
    static void change(int arr[]) {
        arr[0] = 99;
    }
}
