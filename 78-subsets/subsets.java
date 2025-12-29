import java.util.*;

class Solution {
    void sub(int[] nums,int i, List<Integer> l,List<List<Integer>> ans){
        if(i==nums.length){
            ans.add(new ArrayList<>(l));
            return;
        }
       
        l.add(nums[i]);
        sub(nums,i+1,l,ans);
        l.remove(l.size()-1);
         sub(nums,i+1,l,ans);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        sub(nums, 0, new ArrayList<>(), ans);
        return ans;
    }
}
