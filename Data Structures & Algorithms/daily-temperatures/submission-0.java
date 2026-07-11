class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] output = new int[temperatures.length];
        for(int i = 0; i < temperatures.length; i++) {
            int currentDay = temperatures[i];

            while (!stack.isEmpty() && temperatures[stack.peek()] < currentDay) {
                int removedIndex = stack.pop();
                output[removedIndex] = i - removedIndex;
            }
            stack.push(i);
        }
        return output;
    }
}
