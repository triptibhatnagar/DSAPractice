import java.util.Arrays;

public class FirstLastOcc {
    static int firstOcc(int nums[], int x) {
        int l = 0;
        int h = nums.length-1;
        while(l <= h) {
            int m = l + (h-l)/2;
            if(nums[m] >= x) {
                // lhs
                h = m-1;
            }else {
                l = m+1;
            }
        }
        return l;
    }
    static int lastOcc(int nums[], int x) {
        int l = 0;
        int h = nums.length-1;
        while(l <= h) {
            int m = l + (h-l)/2;
            if(nums[m] <= x) {
                // rhs
                l = m+1;
            }else {
                h = m-1;
            }
        }
        return h;
    }
    static int[] searchRange(int nums[], int target) {
        int f = firstOcc(nums, target);
        if(f == nums.length || nums[f] != target) {
            return new int[]{-1,-1};
        }
        int l = lastOcc(nums, target);
        return new int[]{f,l};
    }
    public static void main(String[] args) {
        int nums[] = {5, 7, 7, 8, 8, 10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }
}