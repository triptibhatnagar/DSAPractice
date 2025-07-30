import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PowerSet {
    // generate all possible subsets
    static void func(int arr[], int idx, List<Integer> list, List<List<Integer>> ans) {
        if(idx == arr.length) {
            ans.add(new ArrayList<>(list));
            return;
        }
        // include
        list.add(arr[idx]);
        func(arr, idx+1, list, ans);
        list.remove(list.size()-1);

        // not include
        func(arr, idx+1, list, ans);
    }
    static List<List<Integer>> genSubsets(int arr[]) {
        List<List<Integer>> ans = new ArrayList<>();
        func(arr, 0, new ArrayList<>(), ans);
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        for(List<Integer> subset: genSubsets(arr)) {
            System.out.println(subset);
        }
    }
}