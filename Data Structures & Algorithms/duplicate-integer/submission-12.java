class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        
        for(int num : nums) {
            seen.add(num);
        }

        return nums.length == seen.size() ? false : true;
    }
}