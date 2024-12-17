package E_MoveNegative.WithoutOrder;
import java.util.Arrays;

public class C_TwoPointer {
    public static void main(String[] args) {
        //2 pointers - left, right
        //l,r -> negative -> l++
        //l,r -> positive -> r--
        //l positive and right negative -> swap, l++, r--

        //TIME COMPLEXITY - O(n)
        //SPACE COMPLEXITY - O(1)

        int arr[] = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        moveNeg(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));//[-12, -6, -13, -5, -3, -7, 5, 6, 11]
    }
    static void moveNeg(int arr[], int left, int right) {
        while(left <= right) {
            if(arr[left] < 0 && arr[right] < 0) {
                left++;
            }else if(arr[left] > 0 && arr[right] > 0) {
                right--;
            }else if(arr[left] > 0 && arr[right] < 0) {
                //swap
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }else {
                left++;
                right--;
            }
        }
    }
}
