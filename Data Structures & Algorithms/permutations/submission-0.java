class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> alreadyUsed = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        helper(nums, current, alreadyUsed, output);
        return output;

    }

    public void helper(int[] nums, List<Integer> current, List<Integer> alreadyUsed, List<List<Integer>> output) {
        if (current.size() == nums.length) {
            output.add(new ArrayList<>(current));
            return;
        }
        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if(!alreadyUsed.contains(nums[i])) {
                current.add(num);
                alreadyUsed.add(num);
                helper(nums, current, alreadyUsed, output);
                current.removeLast();
                alreadyUsed.removeLast();
            }
        }

    }
}
