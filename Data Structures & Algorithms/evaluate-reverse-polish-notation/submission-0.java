class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < tokens.length; i++) {
            String token = tokens[i];

            if (token.equals("+")) {
                int n1 = stack.pop();
                int n2 = stack.pop();
                stack.push(n2 + n1);
            } else if (token.equals("-")) {
                int n1 = stack.pop();
                int n2 = stack.pop();
                stack.push(n2 - n1);
            } else if (token.equals("*")) {
                int n1 = stack.pop();
                int n2 = stack.pop();
                stack.push(n2 * n1);
            } else if (token.equals("/")) {
                int n1 = stack.pop();
                int n2 = stack.pop();
                stack.push(n2 / n1);
            } else {
                stack.push(Integer.valueOf(token));
            }

        }
        return stack.pop();
    }
}
