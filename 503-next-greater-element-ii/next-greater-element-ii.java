class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            int g=-1;
            int j=i+1;
            int c=0;
            while(c<n){
                if(nums[j%n]>nums[i]){
                    g=nums[j%n];
                    break;
                }
                j++;
                c++;
            }
            ans[i]=g;

        }
        return ans;
    }
}