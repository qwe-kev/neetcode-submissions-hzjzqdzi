class Solution {
    public boolean isPalindrome(String s) {
       if(s.length() < 2) return true;
       s = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
       int i = 0;
       int j = s.length() - 1;

       while(i <= j) {
        char ch1 = s.charAt(i);
        char ch2 = s.charAt(j);

        if(!isAlnum(ch1)) {
            i++;
            ch1 = s.charAt(i);
        }

        if(!isAlnum(ch2)) {
            j--;
            ch2 = s.charAt(j);
        }

        if(isAlnum(ch1) && isAlnum(ch2)) {
            if(ch1 != ch2) {
                System.out.println(ch1 + " " + ch2);
                return false;
            }
        }
        i++;
        j--;
       }
       return true;
    }

    public boolean isAlnum(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9');
    }
}
