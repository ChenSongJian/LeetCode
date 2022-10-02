// 20. Valid Parentheses

class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        if (s.charAt(0) == ')' || s.charAt(0) == '}' || s.charAt(0) == ']');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else if (s.charAt(i) == ')') {
                    if (stack.pop() != '(') {
                        return false;
                    }
                } else if (s.charAt(i) == '}') {
                    if (stack.pop() != '{') {
                        return false;
                    }
                } else if (s.charAt(i) == ']') {
                    if (stack.pop() != '[') {
                        return false;
                    }
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
