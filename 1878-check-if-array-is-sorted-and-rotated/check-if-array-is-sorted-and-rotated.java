class Solution {
    public boolean check(int[] nums) {
        int rp=-1;
         boolean fs=true;
         int i=0;
         while(i<nums.length-1){
            if(nums[i]<=nums[i+1]){
                fs=true;
            }else{
                rp=i;
                break;
            }
            i++;
            
        }
        if(rp!=-1){
            boolean ss=true;
        i=i+1;
        while(i<nums.length-1){
            if(nums[i]<=nums[i+1]){
                ss=true;
        }else{
            ss=false;
            break;
        }
        i++;
        }
        if(ss==true && fs==true && nums[nums.length-1]<=nums[0]){
            return true;
        }else{
            return false;
        }
        }
        
    return true;
        

    }
}