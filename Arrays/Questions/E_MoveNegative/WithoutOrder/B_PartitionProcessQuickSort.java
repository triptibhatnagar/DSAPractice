package E_MoveNegative.WithoutOrder;
import java.util.Arrays;

public class B_PartitionProcessQuickSort {
    public static void main(String[] args) {
        //TIME COMPLEXITY - O(n)
        //SPACE COMPLEXITY - O(1)
        int arr[] = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        moveNeg(arr);
        System.out.println(Arrays.toString(arr));//[-12, -13, -5, -7, -3, -6, 5, 6, 11]
    }
    static void moveNeg(int arr[]) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0) {
                if(i != j) {
                    //swap
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }
}