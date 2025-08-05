public class UpperBound {
    static int ub(int nums[], int x) {
        int l = 0;
        int h = nums.length-1;
        while (l <= h) {
            int m = l+(h-l)/2;
            if(nums[m] > x) {
                // lhs
                h = m-1;
            }else {
                l = m+1;
            }
        }
        return l;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,2,3};
        int x = 2;
        System.out.println(ub(nums, x));
    }
}