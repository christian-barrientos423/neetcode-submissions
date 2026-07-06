class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toSet());

if (nums.length == 0) {
    return 0;
}
        int maxSequence = 1;
        for (int i = 0; i< nums.length; i++) {
            int number = nums[i];
            if (set.contains(number - 1)) {
                int currentSequence = 2;
                while(set.contains(number + currentSequence - 1)) {
                    currentSequence++;
                }
                if (currentSequence > maxSequence) {
                    maxSequence = currentSequence;
                }
            } 
        }
        return maxSequence;
    }
}
