public class RotSortArrSearchII {
    static boolean search(int[] nums, int k) {
       int l = 0;
       int h = nums.length-1;
       while(l <= h) {
            int m = l+(h-l)/2;
            if(nums[m] == k) {
                return true;
            }
            if(nums[l] == nums[m] && nums[m] == nums[h]) {
                l++;
                h--;
                continue;// as l and h are changed, so start again
            }
            if(nums[m] <= nums[h]) {// rhs sorted
                if(k >= nums[m] && k <= nums[h])
                    l = m+1;
                else
                    h = m-1;
            }else {
                if(k >= nums[l] && k <= nums[m])
                    h = m-1;
                else
                    l = m+1;
            }
       }
       return false;
    }
    public static void main(String[] args) {
        int nums[] = {7, 8, 1, 2, 2, 3, 4, 5, 6};
        int k = 2;
        System.out.println(search(nums, k));
    }
}