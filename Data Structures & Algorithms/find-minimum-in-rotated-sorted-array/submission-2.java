class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int middle = end - start;
        int minimum = Math.min(nums[start], nums[end]);
        while(start < end) {
            middle = end - start;
            if (nums[middle] < minimum) {
                minimum = nums[middle];
            }
            if(nums[middle] > nums[end]) {
                start = middle +1;
            } else {
                end = middle - 1;
            }
        }
        return minimum;
    }
}
