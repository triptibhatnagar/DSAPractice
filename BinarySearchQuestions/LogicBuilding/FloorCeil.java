import java.util.Arrays;

public class FloorCeil {
    // floor - just chota
    // ceil - just bda
    static int getFloor(int nums[], int x) {
        if(nums.length == 0)
            return -1;
        if(x < nums[0]) 
            return -1;
        int l = 0;
        int h = nums.length-1;
        while(l <= h) {
            int m = l+(h-l)/2;
            if(nums[m] <= x) {
                // rhs
                l = m+1;
            }else {
                // lhs
                h = m-1;
            }
        }
        return nums[h];
    }
    static int getCeil(int nums[], int x) {
        if(nums.length == 0)
            return -1;
        if(x > nums[nums.length-1]) 
            return -1;
        int l = 0;
        int h = nums.length-1;
        while(l <= h) {
            int m = l+(h-l)/2;
            if(nums[m] >= x) {
                // lhs
                h = m-1;
            }else {
                // rhs
                l = m+1;
            }
        }
        return nums[l];
    }
    static int[] getFloorAndCeil(int nums[], int x) {
        return new int[]{getFloor(nums, x), getCeil(nums, x)};
    }
    public static void main(String[] args) {
        int nums[] = {3, 4, 4, 7, 8, 10};
        int x = 8;
        System.out.println(Arrays.toString(getFloorAndCeil(nums, x)));
    }
}