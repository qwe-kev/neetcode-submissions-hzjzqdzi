class Solution {
    public int characterReplacement(String s, int k) {
        int maxLen = 0;
        int l = 0;
        int r = 0;
        int[] arr = new int[26];
        while(r < s.length()) {
            arr[s.charAt(r) - 'A']++;
            int max = Arrays.stream(arr).max().getAsInt();
            if(r - l + 1 - max <= k) {
                maxLen = Math.max(maxLen, r - l + 1);
                r++;
            }
            else{
                arr[s.charAt(l) - 'A']--;
                l++;
                arr[s.charAt(r) - 'A']--;
            }
        }
        return maxLen;
    }
}
