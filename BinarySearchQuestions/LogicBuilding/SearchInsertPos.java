public class SearchInsertPos {
    // nums[m] >= x
    static int searchInsertPos(int nums[], int x) {
        int l = 0;
        int h = nums.length-1;
        while (l <= h) {
            int m = l+(h-l)/2;
            if (nums[m] >= x) {
                // lhs
                h = m-1;
            }else {
                l = m+1;
            }
        }
        return l;
    }
    public static void main(String[] args) {
        int nums[] = {1, 3, 5, 6};
        int target = 7;
        System.out.println(searchInsertPos(nums, target));
    }
}