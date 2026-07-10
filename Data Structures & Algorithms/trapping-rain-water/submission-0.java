class Solution {
    public int trap(int[] height) {
        int currentMax = 0;
        List<Integer> maxHeightsLeft = new ArrayList<>();
        List<Integer> maxHeightsRight = new ArrayList<>();
        int water = 0;
        
        maxHeightsLeft.add(0);
        maxHeightsRight.add(0);
        for(int i = 1; i < height.length; i++) {
            currentMax = Math.max(currentMax, height[i - 1]);
            maxHeightsLeft.add(currentMax);
        }

        currentMax = 0;
        for(int i = height.length - 2; i > 0; i--) {
            currentMax = Math.max(currentMax, height[i + 1]);
            maxHeightsRight.addFirst(currentMax);
        }
        maxHeightsRight.addFirst(0);

        System.out.println(maxHeightsLeft);
        System.out.println(maxHeightsRight);

        for(int i = 1; i < height.length - 1; i++) {
            int currentWater = Math.min(maxHeightsLeft.get(i), maxHeightsRight.get(i)) - height[i];
            if (currentWater < 0) {
                currentWater = 0;
            }
            water = water + currentWater;
        }

        return water;
    }
}
