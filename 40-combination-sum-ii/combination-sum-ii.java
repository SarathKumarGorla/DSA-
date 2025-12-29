import java.util.*;

class Solution {

    void gen(int i, int[] candidates, int target,
             List<Integer> l, List<List<Integer>> ans) {

        // Base case
        
        if (target == 0) {
            ans.add(new ArrayList<>(l));
             return;
        }
           
        

        // Take the current element (can reuse same index)
        for(int j=i;j<candidates.length;j++){
            if(j>i && candidates[j]==candidates[j-1])continue;
            if(candidates[j]>target){
                return ;
            }
                l.add(candidates[j]);
                gen(j+1, candidates, target - candidates[j], l, ans);
                l.remove(l.size() - 1); // backtrack        
            
        
        }
        

        // Not take the current element
       
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        gen(0, candidates, target, new ArrayList<>(), ans);
        return ans;
    }
}