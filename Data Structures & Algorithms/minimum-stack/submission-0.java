class MinStack {

    ArrayList<Integer[]> list;

    public MinStack() {
        list = new ArrayList<>();
    }
    
    public void push(int val) {
        int min;
        if(list.size() == 0) {
            min = val;
        } else {
            min = Math.min(list.getLast()[1], val);
        }
        list.add(new Integer[]{val,min});
        
        
    }
    
    public void pop() {
        list.removeLast();
    }
    
    public int top() {
        return list.getLast()[0];
    }
    
    public int getMin() {
        return list.getLast()[1];
    }
}
