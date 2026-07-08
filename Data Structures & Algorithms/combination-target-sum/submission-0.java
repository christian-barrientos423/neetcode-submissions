class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> results = new ArrayList<>();
        helper(nums, new ArrayList<Integer>(), 0, target, 0, results);
        return results;
    }

    public void helper(int[] nums, List<Integer> currentNums, int currentSum, int target, int numbersDone, List<List<Integer>> results) {
        if (currentSum > target) {
            return;
        }
        if (currentSum == target) {
            results.add(new ArrayList<>(currentNums));
            return;
        }
        for(int i = numbersDone; i < nums.length; i++) {
            currentNums.add(nums[i]);
            helper(nums, currentNums, currentSum + nums[i], target, i, results);
            currentNums.removeLast();
        }
    }
}
