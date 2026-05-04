class Solution {
    public int removeElement(int[] nums, int val) {
        int[] res = new int[nums.length];
        int count = 0;

        for(int num : nums) {
            if(num == val) {
                continue;
            }
            else{
                res[count] = num;
                count++;
            }
        }

        for(int i = 0; i < count; i++) {
            nums[i] = res[i];
        }
        
        return count;
    }
}