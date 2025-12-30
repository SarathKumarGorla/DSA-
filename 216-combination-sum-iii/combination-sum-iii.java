class Solution {
    void gen(int k,int n,int[] nums,int i,int sum,List<Integer> l, List<List<Integer>> ans){
        if(sum==n){
            if(l.size()==k){
                ans.add(new ArrayList(l));
            }
            return;
        }
        for(int j=i;j<9;j++){
            if(j>i && nums[j]==nums[j-1]){
                continue;
            }
            if(nums[j]>n)continue;
            l.add(nums[j]);
            gen(k,n,nums,j+1,sum+nums[j],l,ans);
            l.remove(l.size()-1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans=new ArrayList<>();
        int[]nums ={1,2,3,4,5,6,7,8,9};
        gen(k,n,nums,0,0,new ArrayList(),ans);
        return ans;
    }
}