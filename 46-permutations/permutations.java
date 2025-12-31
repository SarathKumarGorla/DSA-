class Solution {
    void gen(int[] nums,boolean[] arr,List<Integer> l,List<List<Integer>> ans){
        if(l.size()==nums.length){
            ans.add(new ArrayList(l));
            return;
        }
         
        for(int i=0;i<nums.length;i++){
            if(arr[i])continue;
            arr[i]=true;
            l.add(nums[i]);
            gen(nums,arr,l,ans);
            arr[i]=false;
            l.remove(l.size()-1);
        }
            
        
        
    }
    public List<List<Integer>> permute(int[] nums) {
         List<List<Integer>> ans=new ArrayList<>();
        
         gen(nums, new boolean[nums.length],new ArrayList(),ans);
         return ans;

    }
}