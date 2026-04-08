class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> seenMap = new HashMap<>();
        for(int num : nums) {
            if(!seenMap.containsKey(num)) {
                seenMap.put(num, 1);
            }
            else{
                return true;
            }
        }
        return false;
    }
}