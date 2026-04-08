class MinStack {

    private List<Integer> list;

    public static int stackSize;

    public static int minEle;


    public MinStack() {
        this.list = new ArrayList<>();
        this.stackSize = 0;
        this.minEle = Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        this.list.add(val);
        this.stackSize++;
        this.minEle = Math.min(minEle, val);
    }
    
    public void pop() {
        if(this.list.get(this.stackSize - 1) == minEle) {
            this.minEle = Integer.MAX_VALUE;
        }
        this.list.remove(this.stackSize - 1);
        this.stackSize--;
    }
    
    public int top() {
        return this.list.get(this.stackSize - 1);
    }
    
    public int getMin() {
        for(int ele : this.list) {
            this.minEle = Math.min(this.minEle, ele);
        }
        return this.minEle;
    }
}
