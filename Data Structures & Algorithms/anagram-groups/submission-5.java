class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> seen = new HashMap<>();
        List<List<String>> res = new ArrayList<>();
        for(String str : strs) {
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String s = new String(ch);

            if(seen.containsKey(s)) {
                seen.get(s).add(str);
            }
            else{
                seen.put(s, new ArrayList());
                seen.get(s).add(str);
            }
        }

        for(Map.Entry<String, List<String>> entry : seen.entrySet()) {
            res.add(entry.getValue());
        }

        return res;
    }
}
