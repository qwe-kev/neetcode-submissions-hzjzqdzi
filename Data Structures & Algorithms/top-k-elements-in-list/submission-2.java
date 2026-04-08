class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hashMap = new HashMap<>();

        int[] res = new int[k];

        for(int num : nums) {
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(hashMap.entrySet());

        entryList.sort((a, b) -> b.getValue() - a.getValue());

        for(int i = 0; i < k; i++) {
            res[i] = entryList.get(i).getKey();
        }

        return res;
    }
}
