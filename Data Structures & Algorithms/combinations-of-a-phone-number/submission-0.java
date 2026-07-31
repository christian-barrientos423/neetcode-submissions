class Solution {
    public List<String> letterCombinations(String digits) {
        
        List<String> output = new ArrayList<>();
        if (digits == null || digits.isEmpty()) {
            return output;
        }
        Map<Integer, List<Character>> digitsMap = new HashMap<>();

        digitsMap.put(2, List.of('a', 'b', 'c'));
        digitsMap.put(3, List.of('d', 'e', 'f'));
        digitsMap.put(4, List.of('g', 'h', 'i'));
        digitsMap.put(5, List.of('j', 'k', 'l'));
        digitsMap.put(6, List.of('m', 'n', 'o'));
        digitsMap.put(7, List.of('p', 'q', 'r', 's'));
        digitsMap.put(8, List.of('t', 'u', 'v'));
        digitsMap.put(9, List.of('w', 'x', 'y', 'z'));

        helper(digits, digitsMap, "", 0, output);
        return output;
    }

    public void helper(String digits, Map<Integer, List<Character>> digitsMap, String curr, int digitIndex, List<String> output) {
        if (curr.length() == digits.length()) {
                output.add(curr);
                return;
            }
        List<Character> charactersForDigit = digitsMap.get(Integer.valueOf(digits.charAt(digitIndex) - '0'));
        for(int i = 0; i < charactersForDigit.size(); i++) {
            helper(digits, digitsMap, curr + charactersForDigit.get(i), digitIndex+1, output);
        }
        
    }
}
