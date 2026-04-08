class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean flag = false;
        Map <Integer, Integer> hashMap = new HashMap<>();
        for(int num : nums) {
            if(!hashMap.containsKey(num)) {
                hashMap.put(num, 1);
            }
            else{
                flag = true;
                break;
            }
        }        
        return flag;
    }
}