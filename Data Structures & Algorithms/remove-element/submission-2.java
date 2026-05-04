class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;

        for(int num : nums) {
            if(num == val) {
                continue;
            }
            else{
                nums[count] = num;
                count++;
            }
        }


        return count;
    }
}