
class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length()).append("$").append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> output = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            // Find the delimiter index
            int delimiterIndex = str.indexOf("$", i);
            
            // Extract the length prefix
            int length = Integer.parseInt(str.substring(i, delimiterIndex));
            
            // Move pointer to the start of the word (after $)
            i = delimiterIndex + 1;
            
            // Extract the word and add to list
            output.add(str.substring(i, i + length));
            
            // Move pointer to the start of the next length prefix
            i += length;
        }
        return output;
    }
}