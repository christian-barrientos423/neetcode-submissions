class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack<Double> stack = new Stack<>();
        List<Integer[]> orderedList = new ArrayList<>();
        for(int i = 0; i < position.length; i++) {
            Integer[] pair = new Integer[] {position[i], speed[i]};
            orderedList.add(pair);
        }
        orderedList.sort((a, b) -> Integer.compare(b[0], a[0]));

        //double timeToTarget = (target - orderedList.get(i)[0]) / (orderedList.get(i)[1] * 1.0);

        for(int i = 0; i < orderedList.size(); i++) {
            if (stack.isEmpty()) {
                double timeToTarget = (target - orderedList.get(i)[0]) / (orderedList.get(i)[1] * 1.0);
                stack.push(timeToTarget);
            } else {
                double timeToTarget = (target - orderedList.get(i)[0]) / (orderedList.get(i)[1] * 1.0);
                if(timeToTarget > stack.peek()) {
                    stack.push(timeToTarget);
                }
            }
        }
        return stack.size();

        
    }
}
