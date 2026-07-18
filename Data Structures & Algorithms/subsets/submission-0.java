class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        backtrack(0, nums, new ArrayList<>(), output);
        return output;
    }

    private void backtrack(int i, int[] nums, List<Integer> curr, List<List<Integer>> output) {
        output.add(new ArrayList<>(curr));
        for(int j = i; j < nums.length; j++) {
            curr.add(nums[j]);
            backtrack(j + 1, nums, curr, output);
            curr.remove(curr.size() - 1);
        }
    }
}
