class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = first(nums, target);
        result[1] = last(nums, target);
        return result;
    }
    
    // First occurrence
    private int first(int[] nums, int target) {
        int l = 0, h = nums.length - 1;
        int ans = -1;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (nums[mid] == target) {
                ans = mid; 
                h = mid - 1; // go left
            } else if (nums[mid] > target) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    // Last occurrence
    private int last(int[] nums, int target) {
        int l = 0, h = nums.length - 1;
        int ans = -1;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (nums[mid] == target) {
                ans = mid;
                l = mid + 1; // go right
            } else if (nums[mid] > target) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }
}
