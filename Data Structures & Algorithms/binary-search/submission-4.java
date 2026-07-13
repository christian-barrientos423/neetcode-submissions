class Solution {
    public int search(int[] nums, int target) {
        int mid = nums.length/2;
        int start = 0;
        int end = nums.length - 1;
        if(nums.length == 1) {
            if (target == nums[0]) {
                return 0;
            } else {
                return -1;
            }
        }
        
        while(start <= end) {
            mid = (end-start)/2 + start;
            int current = nums[mid];
            if(current == target) {
                return mid;
            } else if(current > target) {
                end = mid - 1;
                
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
