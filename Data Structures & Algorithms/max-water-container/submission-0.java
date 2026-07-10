class Solution {
    public int maxArea(int[] heights) {
        int first = 0;
        int last = heights.length - 1;
        int max = 0;
        while(first < last) {
            int firstHeight = heights[first];
            int lastHeight = heights[last];
            int currentMax = (last-first) * Math.min(firstHeight, lastHeight); 
            max = Math.max(max, currentMax);
            if(firstHeight < lastHeight) {
                first++;
            } else {
                last--;
            }
        }
        return max;
    }
}
