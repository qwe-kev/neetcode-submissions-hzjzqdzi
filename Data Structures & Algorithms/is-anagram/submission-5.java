class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()) {
            return false;
        }

        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2);

        String s1 = new String(str1);
        String s2 = new String(str2);

        for(int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
