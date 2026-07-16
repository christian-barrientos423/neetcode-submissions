
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        // Syntax Fix: Use Wrapper classes (Character, Integer) instead of primitive types
        Map<Character, Integer> charCount = new HashMap<>();
        if(s1.length() > s2.length()) {
            return false;
        }
        
        
        // Syntax Fix: s1.length() instead of s1.size(), and s1.charAt() typo fixed
        for(int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c) + 1);
            } else {
                charCount.put(c, 1);
            }
        }

        Map<Character, Integer> tempCount = new HashMap<>();

        for(int i = 0; i < s1.length(); i++) {
            char c = s2.charAt(i);
            if(tempCount.containsKey(c)) {
                tempCount.put(c, tempCount.get(c) + 1);
            } else {
                tempCount.put(c,1);
            }
        }
        if(tempCount.equals(charCount)) {
            return true;
        }
        System.out.print("BEFORE WHILE CHAR COUNT: " + charCount.toString());
        System.out.print("\n");
        System.out.print("BEFORE WHILE: " + tempCount.toString());
        System.out.print("\n");
        System.out.print("\n");
        int end = s1.length();

        while(end < s2.length()) {
            char oldC = s2.charAt(end-s1.length());
            int removedCount = tempCount.get(oldC) - 1;
            if(removedCount == 0) {
                tempCount.remove(oldC);
            } else {
                tempCount.put(oldC, removedCount);
            }
            char newC = s2.charAt(end);
            if(tempCount.containsKey(newC)) {
                tempCount.put(newC, tempCount.get(newC) + 1);
            } else {
                tempCount.put(newC, 1);
            }
            System.out.print("DURING WHILE: " + tempCount.toString());
            System.out.print("\n");
            if(tempCount.equals(charCount)) {
                return true;
            }
            end++;
        }
        return false;

        
        
        
       
    }
}