class Solution {
    public String sortString(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
    public boolean checkInclusion(String s1, String s2) {
        String sortedS1 = sortString(s1);
        for(int i = 0; i < s2.length(); i++) {
            for(int j = i; j < s2.length(); j++) {
                if(j - i + 1 == s1.length()) {
                    String sortedS2 = sortString(s2.substring(i, j + 1));
                    if(sortedS2.equals(sortedS1)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
