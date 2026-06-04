class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        int length = 0;
        int longest = 0;
        for(int num : nums) {
            seen.add(num);
        }

        for(int num : nums) {
            if(!seen.contains(num - 1)) {
                length = 0;
                while (seen.contains(num + length)) {
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
}
