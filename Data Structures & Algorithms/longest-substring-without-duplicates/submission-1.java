class Solution {
     public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int r = 0;
        HashSet<Character> set = new HashSet<>();
        int maxLength = 0;
        while ( r < s.length()) {
            char lChar = s.charAt(l);
            char rChar = s.charAt(r);
            System.out.println("LCHAR = " + lChar + ", RCHAR = " + rChar);
            System.out.println("SET = " + set);
            if (set.contains(rChar)) {
                set.remove(lChar);
                l++;
                System.out.println("MOVING LEFT POINTER");
            } else {
                set.add(rChar);
                r++;
                System.out.println("MOVING RIGHT POINTER");
            }
            maxLength = Math.max(maxLength, r - l);
        }
        return maxLength;
}
}
