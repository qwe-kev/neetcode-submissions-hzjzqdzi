class MyHashSet {
    private final int bucketCount = 729;
    private List<Integer>[] container;

    public MyHashSet() {
        container = new ArrayList[bucketCount];
        for(int i = 0; i < bucketCount; i++) {
            container[i] = new ArrayList<>();
        }
    }

    public int getHash(int key) {
        return key % bucketCount;
    }
    
    public void add(int key) {
        int index = getHash(key);
        if(!container[index].contains(key)) {
            container[index].add(key);
        }
    }
    
    public void remove(int key) {
        int index = getHash(key);
        container[index].remove(Integer.valueOf(key));
    }
    
    public boolean contains(int key) {
        int index = getHash(key);
        return container[index].contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */