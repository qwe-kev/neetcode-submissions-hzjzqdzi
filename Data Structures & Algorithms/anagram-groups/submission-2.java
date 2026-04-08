class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> result = new ArrayList<>();

        for(int i = 0; i < strs.length; i++) {
            
            boolean found = false;

            List<String> anagramsGrouped = new ArrayList<String>();
            for (List<String> innerList : result) {
               
                if (innerList.contains(strs[i])) {
                    found = true;
                    break; 
                }
            }

            if(found) {
                continue;
            }
            else{
                anagramsGrouped.add(strs[i]);
            }

            char[] charArray = strs[i].toCharArray();

            Arrays.sort(charArray);

            String sortedString = new String(charArray);
            
            for(int j = i + 1; j < strs.length; j++) {

                charArray = strs[j].toCharArray();

                Arrays.sort(charArray);

                String s = new String(charArray);

                if(sortedString.equals(s)) {
                    anagramsGrouped.add(strs[j]);
                }
            }

            result.add(anagramsGrouped);
        }
        return result;
    }
}
