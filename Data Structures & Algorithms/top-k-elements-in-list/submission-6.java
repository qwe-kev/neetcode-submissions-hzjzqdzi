class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];

        Map<Integer, Integer> seen = new HashMap<>();

        for(int num : nums) {
            seen.put(num, seen.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(seen.entrySet());

        entryList.sort((a, b) -> b.getValue() - a.getValue());

        for(int i = 0; i < k; i++) {
            res[i] = entryList.get(i).getKey();
        }

        return res;
    }
}
