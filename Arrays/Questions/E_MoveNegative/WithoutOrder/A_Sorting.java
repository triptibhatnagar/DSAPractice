package E_MoveNegative.WithoutOrder;
import java.util.Arrays;

public class A_Sorting {
    public static void main(String[] args) {// Order of elements is not important here.
        //TIME COMPLEXITY - O(n log n)
        //SPACE COMPLEXITY - O(1)
        int arr[] = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        moveNeg(arr);
        System.out.println(Arrays.toString(arr));//[-13, -12, -7, -6, -5, -3, 5, 6, 11]
    }
    static void moveNeg(int arr[]) {
        Arrays.sort(arr);
    }
}