class Solution {
     public int lengthOfLongestSubstring(String s) {
    int start = 0;
    int end = 0;
    int longest = 0;
    HashSet<Character> set = new HashSet<>();

    while (end < s.length()) {
        char endChar = s.charAt(end);
        
        // If we find a duplicate, shrink from the left
        while (set.contains(endChar)) {
            set.remove(s.charAt(start));
            start++;
        }
        
        // Add the new character and expand
        set.add(endChar);
        longest = Math.max(longest, end - start + 1);
        end++;
    }
    
    return longest;
}
}
