class Solution {
    public static int linearSearch(int[] nums, int target, int start, int end) {
		for(int i = start; i <= end; i++) {
			if(nums[i] == target) {
				return i;
			}
		}
		return -1;
	}

	public static boolean hasDuplicate(int[] nums) {
		for(int i = 0; i < nums.length; i++) {
			if(linearSearch(nums, nums[i], i+1, nums.length - 1) >= 0 ) {
				return true;
			}
		}
		return false;
	}
}