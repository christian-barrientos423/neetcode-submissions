class Solution {
     public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        
        for (int i = 0; i<s.length(); i++) {
            char bracket = s.charAt(i);
            if (bracket == '(' || bracket == '{' || bracket == '[') {
                stack.add(bracket);
            }
            else if (bracket == ')') {
                if (stack.empty()) {
                    return false;
                }
                else if(stack.peek() != '(') {
                    return false;
                }
                else {
                    stack.pop();
                }
            } else if (bracket == '}') {
                if (stack.empty()) {
                    return false;
                }
                else if(stack.peek() != '{') {
                    return false;
                }
                else {
                    stack.pop();
                }
            } else if (bracket == ']') {
                if (stack.empty()) {
                    return false;
                }
                else if(stack.peek() != '[') {
                    return false;
                }
                else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}
