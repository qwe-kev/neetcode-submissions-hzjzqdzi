class Solution {
    public void reverseString(char[] s) {
        int l = 0;
        int r = s.length - 1;

        if(s.length <= 1) {
            return;
        }

        while(l < r) {
            char temp = s[l];
            char ch1 = s[r];
            s[l] = ch1;
            s[r] = temp;
            l++;
            r--;
        }
    }
}