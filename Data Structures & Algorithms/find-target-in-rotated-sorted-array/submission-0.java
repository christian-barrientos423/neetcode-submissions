class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int middle = end - start;
        if (nums[start] == target) {
            return start;
        } else if (nums[end] == target) {
            return end;
        }
        while(start < end) {
            middle = end - start;
            if (nums[middle] == target) {
                return middle;
            }
            if(nums[middle] > nums[end]) {
                start = middle +1;
            } else {
                end = middle - 1;
            }
        }
        return -1;
    }
}
