class Solution {
    void gen(int[] nums,int in,List<List<Integer>> ans){
        if(in==nums.length){
            List<Integer> l=new ArrayList<>();
            for(int n:nums){
                l.add(n);
            }
            ans.add(new ArrayList<>(l));
            return;
        }
         
        for(int i=in;i<nums.length;i++){
            int t=nums[in];
            nums[in]=nums[i];
            nums[i]=t;
            gen(nums,in+1,ans);
             t=nums[in];
            nums[in]=nums[i];
            nums[i]=t;
        }
            
        
        
    }
    public List<List<Integer>> permute(int[] nums) {
         List<List<Integer>> ans=new ArrayList<>();
        
         gen(nums,0,ans);
         return ans;

    }
}