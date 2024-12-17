package C_KthMaxMin;
import java.util.Arrays;

public class A_Sorting {
    public static void main(String[] args) {
        //TIME COMPLEXITY - O(n log n)
        //SPACE COMPLEXITY - O(1)
        int arr[] = {6, 15, 4, 12, 10, 1, 16};
        kthmaxmin(arr);
    }
    static void kthmaxmin(int arr[]) {
        if(arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }
        Arrays.sort(arr);
        System.out.println("Max: "+arr[arr.length-1]);
        System.out.println("Min: "+arr[0]);
    }
}