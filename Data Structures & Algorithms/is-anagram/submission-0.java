class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        if (s.length()!=t.length()) {
            return false;
        }
        
        for(char letter:s.toCharArray()) {
            if (map.containsKey(letter)) {
                map.put(letter, map.get(letter) + 1);
            }
            else {
                map.put(letter, 1);
            }
        }
        for(char letter:t.toCharArray()) {
            if (map.containsKey(letter) && map.get(letter) > 0) {
                map.put(letter, map.get(letter) - 1);
            }
            else {
                return false;
            }
        }
        return true;

    }
}
