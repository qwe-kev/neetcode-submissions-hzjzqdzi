class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map <String, List<String>> anagrams = new HashMap<>();

        for(String s : strs) {
            char[] keyArray = s.toCharArray();

            Arrays.sort(keyArray);

            String sortedKey = new String(keyArray);

            anagrams.computeIfAbsent(sortedKey, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(anagrams.values());
    }
}
