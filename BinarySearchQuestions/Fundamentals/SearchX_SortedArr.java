public class SearchX_SortedArr {
    static int searchX_iter(int nums[], int x) {
        int l = 0;
        int h = nums.length-1;
        while (l <= h) {
            int m = l+(h-l)/2;
            if(nums[m] == x) 
                return m;
            else if(nums[m] < x)
                // rhs
                l = m+1;
            else
                h = m-1;
        }
        return -1;
    }
    static int searchX_rec(int nums[], int x, int l, int h) {
        if(l > h)
            return -1;
        int m = l+(h-l)/2;
        if(nums[m] == x)
            return m;
        if(nums[m] < x) 
            return searchX_rec(nums, x, m+1, h);
        return searchX_rec(nums, x, l, m-1);
    }
    public static void main(String[] args) {
        int nums[] = {-1,0,3,5,9,12};
        int target = -1;
        System.out.println(searchX_iter(nums, target));
        System.out.println(searchX_rec(nums, target, 0, nums.length-1));
    }
}