package D_ZeroOneTwoArray;
import java.util.Arrays;

public class A_Sorting {
    public static void main(String[] args) {
        //TIME COMPLEXITY - O(N log N)
        //SPACE COMPLEXITY - O(1)
        int arr[] = {0, 1, 2, 2, 1, 0};
        arrangeascending(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void arrangeascending(int arr[]) {
        Arrays.sort(arr);
    }
}