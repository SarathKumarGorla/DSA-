import java.util.*;
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Map<Integer,Integer> m= new HashMap<>();
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(m.containsKey(nums[i])){
                l.add(nums[i]);
                m.put(nums[i],m.get(nums[i])+1);
            }else{
                m.put(nums[i],1);
            }
        }
        return l;
    }
}