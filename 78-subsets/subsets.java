import java.util.*;

class Solution {
    private void sub(int[] nums, int i, List<Integer> cur, List<List<Integer>> ans) {
        if (i == nums.length) {
            ans.add(new ArrayList<>(cur)); // add a copy
            return;
        }

        // Exclude nums[i]
        sub(nums, i + 1, cur, ans);

        // Include nums[i]
        cur.add(nums[i]);
        sub(nums, i + 1, cur, ans);
        cur.remove(cur.size() - 1); // backtrack
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        sub(nums, 0, new ArrayList<>(), ans);
        return ans;
    }
}
