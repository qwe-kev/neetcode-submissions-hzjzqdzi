class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        String reversed = new StringBuilder(s).reverse().toString();
        for(int i = 0; i < reversed.length(); i++) {
            if(reversed.charAt(i) != s.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
