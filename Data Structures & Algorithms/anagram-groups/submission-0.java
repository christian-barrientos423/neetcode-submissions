class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap();
        for (int i = 0; i< strs.length; i ++) {
            String word = strs[i];
            int[] alphabet = new int[26];
            for (int j=0; j< word.length(); j++) {
                char character = word.charAt(j);
                alphabet[character - 'a'] = alphabet[character - 'a'] + 1;
            }
            if (map.containsKey(Arrays.toString(alphabet))) {
                map.get(Arrays.toString(alphabet)).add(word);
            }
            else {
                ArrayList newList = new ArrayList();
                newList.add(word);
                map.put(Arrays.toString(alphabet), newList);
            }
        }
        return new ArrayList<>(map.values());
    }
}
