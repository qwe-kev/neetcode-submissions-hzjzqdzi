class Solution {
    public boolean isValid(String s) {
        if(s.length() < 2) {
            return false;
        }
        Deque<Character> stack = new ArrayDeque<>();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }
            else if(ch == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            }
            else if(ch == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            }
            else if(ch == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            }
            else{
                return false;
            }
        }
        return stack.isEmpty();
    }
}
