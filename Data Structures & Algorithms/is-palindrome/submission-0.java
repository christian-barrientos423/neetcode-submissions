class Solution {
    public boolean isPalindrome(String s) {
        String string = s.toLowerCase();
        int i = 0;
        int j = string.length() - 1;
        while (i < j) {
            if (string.charAt(i) == string.charAt(j)) {
                i++;
                j--;
            }
            else if (!Character.isLetterOrDigit(string.charAt(i)) && !Character.isLetterOrDigit(string.charAt(j))) {
                i++;
                j--;
            } 
            else if (!Character.isLetterOrDigit(string.charAt(i))) {
                i++;
            } 
            else if (!Character.isLetterOrDigit(string.charAt(j))) {
                j--;
            }
            else {
                return false;
            }

        }
        return true;
    }
}
