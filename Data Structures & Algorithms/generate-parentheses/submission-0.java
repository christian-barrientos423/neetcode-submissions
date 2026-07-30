class Solution {
    public List<String> generateParenthesis(int n) {
        
        List<String> output = new ArrayList<>();
        helper(n, new Stack<Character>(), 0, 0, output);
        return output;
    }

    public void helper(int n, Stack<Character> curr, int openUsed, int closedUsed, List<String> output) {
        if (n == closedUsed && n == openUsed) {
            StringBuilder sb = new StringBuilder();
            for (char c : curr) {
                sb.append(c);
            }
            output.add(sb.toString());
            return;
        }
            if(openUsed < n) {
                curr.push('(');
                helper(n, curr, openUsed+1, closedUsed, output);
                curr.pop();
            } 
        
                if( closedUsed < openUsed) {
                    curr.push(')');
                    helper(n, curr, openUsed, closedUsed + 1, output);
                    curr.pop();
                } 
                
                

            
        
    }
}
