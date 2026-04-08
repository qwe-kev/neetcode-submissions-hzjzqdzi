class Solution {
	public static boolean hasDuplicate(int[] nums) {
		Map<Integer, Integer> countMap = new HashMap<>();
        for(int num : nums) {
            if(countMap.containsKey(num)) {
                return true;
            }
            countMap.put(num, 1);
        }
        return false;
	}
}