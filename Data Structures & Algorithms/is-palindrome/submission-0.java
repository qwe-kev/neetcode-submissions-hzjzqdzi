class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder(s);
        str.reverse();
        String res = str.toString().replaceAll("[^a-zA-Z0-9]","");
        return s.replaceAll("[^a-zA-Z0-9]","").toLowerCase().equals(res.toLowerCase());
    }
}
