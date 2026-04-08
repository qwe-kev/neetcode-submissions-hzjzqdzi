class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(nums.length <= 1) {
            return n;
        }
       Arrays.sort(nums);
       int count = 1;
       int maxCount = 1;
       for(int i = 1; i < n; i++) {
        if(nums[i] == nums[i-1]) {
            continue;
        }
        if(nums[i] == nums[i-1] + 1) {
            count++;
        }
        else{
            maxCount = Math.max(count, maxCount);
            count = 1;
        }
       }
        maxCount = Math.max(count, maxCount);
        return maxCount;
    }
}
