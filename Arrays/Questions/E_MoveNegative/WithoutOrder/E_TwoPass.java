package E_MoveNegative.WithoutOrder;
import java.util.Arrays;

public class E_TwoPass {
    public static void main(String[] args) {
        //1. count no. of neg elem
        //2. mov neg
        //two traversals
        int arr[] = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        moveNeg(arr);
        System.out.println(Arrays.toString(arr));//[-12, -3, -13, -5, -6, -7, 5, 11, 6]
    }
    static void moveNeg(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0) {
                count++;
            }
        }
        int i = 0;
        int j = count;
        while(i < count && j < arr.length) {
            if(arr[i] < 0) {
                i++;
            }else if(arr[j] >= 0) {
                j++;
            }else {// arr[i] is positive and arr[j] is negative
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            }
        }
    }
}