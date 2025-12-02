class Solution {
    public void sortColors(int[] nums) {
        int r=0;
        int w=0;
        int b=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                r++;
            }else if(nums[i]==1){
                w++;
            }else{
                b++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(r>=1){
                nums[i]=0;
                r--;
            }else if(w>=1){
                nums[i]=1;
                w--;
            }else{
                nums[i]=2;
                b--;
            }
        }
 
    }
}