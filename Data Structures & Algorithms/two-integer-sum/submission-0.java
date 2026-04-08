class Solution {
    public static int linearSearch(int[] nums, int start, int end, int target) {
		for(int i = start; i <= end; i++) {
			if(nums[i] == target) {
				return i;
			}
		}
		return -1;
	}

	public static int[] twoSum(int[] nums, int target) {
        
        int[] res = new int[2];

        int pos = 0;

        for(int i = 0; i < nums.length; i++) {
        	int idx2 = linearSearch(nums, i + 1, nums.length - 1, target - nums[i]);
        	if(idx2 > 0) {
        		res[0] = i;
        		res[1] = idx2;
        	}
        }
        return res;
    }
}
