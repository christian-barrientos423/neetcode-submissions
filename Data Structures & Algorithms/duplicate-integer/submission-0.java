class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap map = new HashMap();
        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 0);
            
            } else {
                return true;
            }
            
        }
        return false;
    }
}