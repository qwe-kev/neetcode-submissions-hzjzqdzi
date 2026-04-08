class Solution {
    public int[] twoSum(int[] nums, int target) {
         for(int i = 0; i < nums.length; i++) {
        	for(int j = 0; j < nums.length - 1; j++) {
        		if(i != j) {
        			if(target - nums[i] == nums[j]) {
        				if(i < j) {
        					return new int[] {i, j};
        				}
        				else{
        					return new int[] {j, i};
        				}
        			}
        		}
        	}
        }
        return new int[] {};
    }
}
