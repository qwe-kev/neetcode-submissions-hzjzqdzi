class Solution {
    public boolean isAlnum(char ch) {
      return Character.isLetterOrDigit(ch);
    }

    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^A-Za-z0-9]", "");
        s = s.toLowerCase();
        int l = 0; 
        int r = s.length() - 1;

        while(l < r) {
            char ch1 = s.charAt(l);
            char ch2 = s.charAt(r);
            if( ch1 != ch2) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
