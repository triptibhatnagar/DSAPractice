package E_MoveNegative.WithOrder;
import java.util.Arrays;

public class A_ModifiedInsertionSort {
    //APPROACH:
    /*
     * if + : skip
     * if - : 
     *      i) shift + elem to right
     *      ii) place - at idx of first + elem
     */
    public static void main(String[] args) {
        //TIME COMPLEXITY: O(N^2)
        //SPACE COMPLEXITY: O(1)
        int arr[] = {-12, 11, -13, 14, 15, 16, -18, -20, 21, 22, -23};
        System.out.println(Arrays.toString(moveNeg(arr)));
    }
    static int[] moveNeg(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > 0) {//+
                continue;
            }
            //-
            int temp = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > 0) {
                arr[j+1] = arr[j];//shift + elem to right
                j--;
            }
            arr[j+1] = temp;//place - at idx of first + elem
        }
        return arr;
    }
}