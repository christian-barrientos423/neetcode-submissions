class MedianFinder {

    PriorityQueue<Integer> smallHeap;
    PriorityQueue<Integer> largeHeap;
    public MedianFinder() {
        // TODO: Initialize your two heaps here
        smallHeap = new PriorityQueue<>(Comparator.reverseOrder());
        largeHeap = new PriorityQueue<>();
    }

    public void addNum(int num) {
        // TODO: Implement the pass-through and balancing logic here
        smallHeap.add(num);
        if (Math.abs(smallHeap.size() - largeHeap.size()) <= 1) {
            System.out.println("BALANCED HEAPS");
            if (smallHeap.size() != 0 && largeHeap.size() != 0 && smallHeap.peek() > largeHeap.peek()) {
                int temp = smallHeap.remove();
                largeHeap.add(temp);
                smallHeap.add(largeHeap.remove());
            }
        } else {
            int smallHeapLargest = smallHeap.remove();
            largeHeap.add(smallHeapLargest);
            //Check if values are valid
            if (smallHeap.size() != 0 && largeHeap.size() != 0 && smallHeap.peek() > largeHeap.peek()) {
                int temp = smallHeap.remove();
                largeHeap.add(temp);
                smallHeap.add(largeHeap.remove());
            }
        }
    }

    public double findMedian() {
        // TODO: Implement the median calculation here
        int size = smallHeap.size() + largeHeap.size();
        if (size % 2 == 0) {
            return (smallHeap.peek()+largeHeap.peek()) / 2.0;
        }
        else {
            return smallHeap.peek();
        }
    }
}