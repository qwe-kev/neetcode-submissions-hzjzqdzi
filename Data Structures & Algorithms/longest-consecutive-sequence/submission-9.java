class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n <= 1) {
            return n;
        }
        Arrays.sort(nums);

        int maxSeq = 1;
        int curSeq = 1;

        for(int i  = 1; i < n; i++) {
            if(nums[i] != nums[i-1]) {
                if(nums[i] == nums[i-1] + 1) {
                    curSeq++;
                }
                else{
                    maxSeq = Math.max(maxSeq, curSeq);
                    curSeq = 1;
                }
            }
        }
        return Math.max(maxSeq, curSeq);
    }
}

