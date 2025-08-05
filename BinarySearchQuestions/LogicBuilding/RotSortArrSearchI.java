public class RotSortArrSearchI {
    static int search(int[] nums, int k) {
       int l = 0;
       int h = nums.length-1;
       while(l <= h) {
            int m = l+(h-l)/2;
            if(nums[m] == k) {
                return m;
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
       return -1;
    }
    public static void main(String[] args) {
        int nums[] = {4, 5, 6, 7, 0, 1, 2};
        int k = 0;
        System.out.println(search(nums, k));
    }
}
