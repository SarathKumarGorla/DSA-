import java.util.*;
class Solution {
    void merge(int lo,int mid,int h,int[] nums){
        int low=lo;
        int high=mid+1;
        ArrayList<Integer> l=new ArrayList<Integer>();
        while (low<=mid && high<=h){
            if(nums[low]<=nums[high]){
                l.add(nums[low]);
                low++;
            }else{
                l.add(nums[high]);
                high++;
            }
        }
        while(low<=mid){
            l.add(nums[low]);
            low++;
        }
         while(high<=h){
            l.add(nums[high]);
            high++;
        }
        low=lo;
        for(int i=0;i<l.size();i++){
            nums[low]=l.get(i);
            low++;
        }

    }
    void sortm(int lo,int h,int[] nums){
       
        if(lo<h){
            int mid=(lo+h)/2;
            sortm(lo,mid,nums);
            sortm(mid+1,h,nums);
            merge(lo,mid,h,nums);
            
        }
    }
    public int[] sortArray(int[] nums) {
        
        int lo=0;
        int h=nums.length-1;
        sortm(lo,h,nums);
        
        return nums;
    
    
    }
}