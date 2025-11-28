class Solution {
    public int[] sortArray(int[] nums) {
        int i=1;
        while(i<nums.length){
            int j=i-1;
            int ele=nums[i];
            while(j>=0 && nums[j]>ele){
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1]=ele;
            i++;
        }
        return nums;
    }
}