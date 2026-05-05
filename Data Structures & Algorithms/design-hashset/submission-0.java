class MyHashSet {
    private ArrayList<Integer> container;

    public MyHashSet() {
        container = new ArrayList<>();
    }
    
    public void add(int key) {
        if(!container.contains(key)) {
            container.add(key);
        }
    }
    
    public void remove(int key) {
        container.remove(Integer.valueOf(key));
    }
    
    public boolean contains(int key) {
        return container.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */