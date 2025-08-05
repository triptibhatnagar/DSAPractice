public class LowerBound {
    static int lb(int nums[], int x) {
        int l = 0;
        int h = nums.length-1;
        while (l <= h) {
            int m = l+(h-l)/2;
            if(nums[m] >= x) {
                // lhs
                h = m-1;
            }else {
                l = m+1;
            }
        }
        return l;
    }
    public static void main(String[] args) {
        int nums[] = {3,5,8,15,19};
        int x = 9;
        System.out.println(lb(nums, x));
    }
}
