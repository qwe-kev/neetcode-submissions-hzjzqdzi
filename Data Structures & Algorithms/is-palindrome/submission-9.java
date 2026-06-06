class Solution {
    public boolean isAlnum(char ch) {
      return Character.isLetterOrDigit(ch);
    }

    public boolean isPalindrome(String s) {
        int l = 0; 
        int r = s.length() - 1;
        s = s.toLowerCase();

        while(l < r) {
            char ch1 = s.charAt(l);
            char ch2 = s.charAt(r);
            if(!isAlnum(ch1)) {
                l++;
            }
            else if(!isAlnum(ch2)) {
                r--;
            }
            else {
                if( ch1 != ch2) {
                    return false;
                }
                l++;
                r--;
            }
        }
        return true;
    }
}
