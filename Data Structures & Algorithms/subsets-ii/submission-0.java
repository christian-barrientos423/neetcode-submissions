class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        List<List<Integer>> output = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        Arrays.sort(nums);

        helper(nums, 0, current, output);
        return output;
    }

    public void helper(int[] nums, int index, List<Integer> current, List<List<Integer>> output) {

        output.add(new ArrayList<>(current));
        for(int i = index; i < nums.length; i++) {
            if(i > index && nums[i] == nums[i-1]) {
                continue;
            }
            int num = nums[i];
            current.add(num);
            helper(nums, i + 1, current, output);
            current.removeLast();

        }
    }
}
