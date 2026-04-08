class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();

        for(String s : strs) {
            encoded.append(s.length()).append(":").append(s);
        }

        return encoded.toString();
    }

    public List<String> decode(String str) {
         List<String> strs = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = str.indexOf(':', i);
            int length = Integer.parseInt(str.substring(i, j));
            j++;
            String word = str.substring(j, j + length);
            String originalString = new StringBuilder(word).toString();
            strs.add(originalString);
            i = j + length;
        }
        return strs;
    }
}


