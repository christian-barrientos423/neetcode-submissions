class Solution {
    public int characterReplacement(String s, int k) {
        int maxCount = 0;
        int maxCharacterCount = 0;
        int start = 0;
        int end = 0;
        Map<Character, Integer> frequencyMap = new HashMap<>();

        while(start<=end && end < s.length()) {
            char endChar = s.charAt(end);
            frequencyMap.put(endChar, frequencyMap.getOrDefault(endChar, 0) + 1);

            maxCharacterCount = Math.max(maxCharacterCount, frequencyMap.get(endChar));

            while(end-start+1 - maxCharacterCount > k) {
                char startChar = s.charAt(start);
                frequencyMap.put(startChar, frequencyMap.get(startChar) - 1);
                start++;
            }
            maxCount = Math.max(maxCount, end - start + 1);
            end++;
        }
        return maxCount;
      
    }
}
