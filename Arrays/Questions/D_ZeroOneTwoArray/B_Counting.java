package D_ZeroOneTwoArray;
import java.util.Arrays;

public class B_Counting {
    public static void main(String[] args) {//better approach  but it is not stable and requires two traversals of the array
        //TIME COMPLEXITY - O(N)
        //SPACE COMPLEXITY - O(1)
        int arr[] = {0, 1, 2, 2, 1, 0};
        arrangeascending(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void arrangeascending(int arr[]) {
        int zero = 0;
        int one = 0;
        int two = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 0) {
                zero++;
            }else if(arr[i] == 1) {
                one++;
            }else {
                two++;
            }
        }
        int idx = 0;
        for(int i=1; i<=zero; i++) {
            arr[idx] = 0;
            idx++;
        }
        for(int i=1; i<=one; i++) {
            arr[idx] = 1;
            idx++;
        }
        for(int i=1; i<=two; i++) {
            arr[idx] = 2;
            idx++;
        }
    }
}