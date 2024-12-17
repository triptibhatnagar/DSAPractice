package E_MoveNegative.WithOrder;

import java.util.Arrays;

public class B_SequentialPlacingOfNegElem {
    public static void main(String[] args) {
        //TIME COMPLEXITY: O(N^2)
        //SPACE COMPLEXITY: O(1)
        int arr[] = {-12, 11, -13, 14, 15, 16, -18, -20, 21, 22, -23};
        System.out.println(Arrays.toString(moveNeg(arr)));
    }
    static int[] moveNeg(int arr[]) {
        int idx = -1;//position of last placed negative elem
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0) {
                idx++;

                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;

                if(i-idx >= 2) {
                    // rotateSubArr(arr, left, right);
                    int left = idx+1;
                    int right = i;
                    int elem = arr[right];
                    for (int j = right; j >= left; j--) {
                        arr[j] = arr[j-1];
                    }
                    arr[left] = elem;
                }
            }
        }
        return arr;
    }
}