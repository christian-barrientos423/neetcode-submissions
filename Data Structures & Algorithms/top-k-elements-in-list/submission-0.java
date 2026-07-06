class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap();
        for ( int i =0; i<nums.length; i++) {
            map.merge(nums[i], 1, Integer::sum);
        }
        List<Integer> top = map.entrySet()
            .stream()
            // 2. Sort by Value
            .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed()).limit(k).map(Map.Entry::getKey).collect(Collectors.toList());
        return top.stream().mapToInt(i -> i).toArray();
    }
}
