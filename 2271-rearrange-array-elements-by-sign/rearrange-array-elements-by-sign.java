class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] arr=new int[nums.length];
        int i=0;
        int p=0;
        int n=0;
        boolean f=true;

        while(p<nums.length && n<nums.length){
            if(nums[p]<0){
                p++;
            }else if(nums[n]>0){
                n++;
            }else if(nums[p]>0 && f==true){
                arr[i]=nums[p];
                f=false;
                p++;
                i++;
            }else{
                arr[i]=nums[n];
                f=true;
                n++;
                i++;
            }
        }
        if(p<nums.length && nums[p]>0 && f==true){
            arr[i]=nums[p];
        }else{
            arr[i]=nums[n];
        }
        return arr;
    }
}