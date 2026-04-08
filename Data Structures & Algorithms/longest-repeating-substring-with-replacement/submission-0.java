class Solution {
    public int characterReplacement(String s, int k) {
        int maxLen = 0;
        for(int i = 0; i < s.length(); i++) {
            int[] arr = new int[26];

            for(int j = i; j < s.length(); j++) {
                arr[s.charAt(j) - 'A']++;
                OptionalInt max = Arrays.stream(arr).max();
                if(j - i + 1 - max.getAsInt() <= k) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }
        return maxLen;
    }
}
