class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map <Integer, Integer> frequencyMap = new HashMap<>();

        for(int num : nums) {
            if(frequencyMap.containsKey(num)) {
                int value = frequencyMap.get(num);
                frequencyMap.put(num, value + 1);
            }
            else {
                frequencyMap.put(num, 1);
            }
        }

        List <Map.Entry<Integer, Integer>> entryList = new ArrayList<>(frequencyMap.entrySet());

        entryList.sort((a, b) -> b.getValue() - a.getValue());

        int[] result = new int[k];

        for(int i = 0; i < k; i++) {
            result[i] = entryList.get(i).getKey();
        }

        return result;
    }
}
