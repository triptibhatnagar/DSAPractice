import java.util.Arrays;

public class Sort012Arr {
    static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static void sortZeroOneTwo(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length-1;
        while(mid <= high) {
            if(nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            }
            else if(nums[mid] == 1) {
                mid++;
            }
            else {
                swap(nums, mid, high);
                high--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,0,2,1,0};
        sortZeroOneTwo(arr);
        System.out.println(Arrays.toString(arr));
    }
}

// 3 pointers
// low mid high
// unsorted region lies b/w mid and high