class Solution {
	public static boolean hasDuplicate(int[] nums) {
		Set<Integer> uniqueNums = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        return (uniqueNums.size() == nums.length) ? false : true; 
	}
}