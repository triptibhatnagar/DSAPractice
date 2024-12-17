package B_MaxMin;
import java.util.Arrays;

public class B_Sorting {
    public static void main(String[] args) {
        /*
        The number of comparisons made to find the minimum and maximum elements is equal to the number of comparisons made during the sorting process. For any comparison-based sorting algorithm, the minimum number of comparisons required to sort an array of n elements is O(n log n). Hence, the number of comparisons made in this approach is also O(n log n).
        */
        //TIME COMPLEXITY - O(n log n)
        //SPACE COMPLEXITY - O(1)
        //NO OF COMPARISONS - O(n log n)
        int arr[] = {6, 5, 4, 2, 10, 1};
        maxmin(arr);
    }
    static void maxmin(int arr[]) {
        Arrays.sort(arr);
        int max = arr[0];
        int min = arr[arr.length-1];
        System.out.println("Max element: "+max);
        System.out.println("Min element: "+min);
    }
}