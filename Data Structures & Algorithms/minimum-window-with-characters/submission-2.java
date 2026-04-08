class Solution {
    public Boolean containsString(String s1, String s2) {
       int[] arr = new int[256];
       for(char ch : s2.toCharArray()) {
            arr[ch]++;
       }
       for(char ch : s1.toCharArray()) {
            arr[ch]--;
       }
       for(int x : arr) {
            if(x > 0) return false;
       }
       return true;
    }

    public String minWindow(String s, String t) {

        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            String temp = "" + ch1;
            if(!t.contains(temp)) {
                continue;
            }
            for(int j = i; j < s.length(); j++) {
                char ch2 = s.charAt(j);
                if(j != i)temp += ch2;
                if(temp.length() >= t.length() && containsString(temp, t)) {
                    map.put(temp, temp.length());
                }
            }
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> a.getValue() - b.getValue());
        if(list.size() > 0) {
            return list.get(0).getKey();
        }
        return "";
        }
    }