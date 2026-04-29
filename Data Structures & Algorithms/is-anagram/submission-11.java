class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;

        Map<Character, Integer> seen = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            seen.put(ch1, seen.getOrDefault(ch1, 0) + 1);
            seen.put(ch2, seen.getOrDefault(ch2, 0) - 1);
        }

        for(Map.Entry<Character, Integer> entry : seen.entrySet()) {
            if(entry.getValue() != 0) {
                return false;
            }
        }

        return true;
    }
}
