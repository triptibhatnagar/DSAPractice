package E_MoveNegative.WithoutOrder;
import java.util.Arrays;

public class D_DutchNationalFlag {
    public static void main(String[] args) {
        //TIME COMPLEXITY - O(n)
        //SPACE COMPLEXITY - O(1)
        int arr[] = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        moveNeg(arr);
        System.out.println(Arrays.toString(arr));//[-12, -6, -13, -5, -3, -7, 5, 6, 11]
    }
    static void moveNeg(int arr[]) {
        int start = 0;
        int end = arr.length-1;
        while(start <= end) {
            if(arr[start] <= 0) {
                start++;
            }else {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                end--;
            }
        }
    }
}
