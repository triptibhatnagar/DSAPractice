package D_ZeroOneTwoArray;
import java.util.Arrays;

public class C_DutchNationalFlag {
    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 2, 1, 0};
        System.out.println(Arrays.toString(arrangeascending(arr)));
    }
    static int[] arrangeascending(int arr[]) {
        int start = 0;
        int end = arr.length-1;
        int mid = 0;

        while(mid <= end) {
            if(arr[mid] == 0) {
                int temp = arr[mid];
                arr[mid] = arr[start];
                arr[start] = temp;
                mid++;
                start++;
            }else if(arr[mid] == 1) {
                mid++;
            }else {
                int temp = arr[mid];
                arr[mid] = arr[end];
                arr[end] = temp;
                end--;
            }
        }
        return arr;
    }
}