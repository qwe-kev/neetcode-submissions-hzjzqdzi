class MyHashMap {
    class Entry {
        int key;
        int value;
        public Entry(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
    private final int bucketCount = 769;
    private List<Entry>[] buckets;

    public MyHashMap() {
        buckets = new ArrayList[bucketCount];
        for(int i = 0; i < bucketCount; i++) {
            buckets[i] = new ArrayList<>();
        }
    }
    
    public void put(int key, int value) {
        int index = key % bucketCount;
        for(Entry entry : buckets[index]) {
            if(entry.key == key) {
                entry.value = value;
                return;
            }
        }
        buckets[index].add(new Entry(key, value));
    }
    
    public int get(int key) {
        int index = key % bucketCount;
        for(Entry entry : buckets[index]) {
            if(entry.key == key) {
                return entry.value;
            }
        }
        return -1;
    }
    
    public void remove(int key) {
        Entry toRemove = null;
        int index = key % bucketCount;
        for(Entry entry : buckets[index]) {
            if(entry.key == key) {
                toRemove = entry;
                break;
            }
        }
        if(toRemove != null) {
            buckets[index].remove(toRemove);
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */