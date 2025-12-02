class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int s=nums[0];
        int i=1;
        int ms=s;
        while(i<nums.length){
             if(s<0){
                s=0;
            }
            s+=nums[i];
            
           
            ms=Math.max(s,ms);
            i++;
        }
        
        return ms;
    }
}