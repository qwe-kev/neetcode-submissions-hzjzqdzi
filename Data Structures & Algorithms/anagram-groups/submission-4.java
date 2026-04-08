class Solution {
    public static boolean isAnagram(String s1, String s2) {
        if(s1.length() != s2.length()) {
            return false;
        }
        Map<Character, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < s1.length(); i++) {
            char key = s1.charAt(i);
            Integer value = hashMap.get(key);
            if(hashMap.containsKey(key)) {
                hashMap.put(key, ++value);
            }
            else{
                hashMap.put(key, 1);
            }
        }

        for(int i = 0; i < s2.length(); i++) {
            char key = s2.charAt(i);
            Integer value = hashMap.get(key);
            if(hashMap.containsKey(key)) {
                hashMap.put(key, --value);
            }
            else{
                hashMap.put(key, 1);
            }
        }
        
        for(Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
            if(entry.getValue() != 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean found(List<List<String>> groups, String s) {
        for(List<String> group : groups) {
            if(group.contains(s)) {
                return true;
            }
        }
        return false;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> anagrams = new ArrayList<>();
        for(int i = 0; i < strs.length; i++) {
            List<String> group = new ArrayList<>();
            if(found(anagrams, strs[i])) {
                continue;
            }
            group.add(strs[i]);
            for(int j = i + 1; j < strs.length; j++) {
                if(isAnagram(strs[i], strs[j])) {
                    group.add(strs[j]);
                }
            }
            anagrams.add(group);
        }
        return anagrams;
    }
}
