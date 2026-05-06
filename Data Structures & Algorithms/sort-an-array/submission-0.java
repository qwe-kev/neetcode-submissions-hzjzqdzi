class Solution {
    public int[] sortArray(int[] nums) {
        boolean swapped;

        for(int i = 0; i < nums.length - 1; i++) {
            swapped = false;
            for(int j = 0; j < nums.length - 1 - i; j++) {
                if(nums[j + 1] < nums[j]) {
                    swapped = true;
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
            if(swapped == false) {
                break;
            }
        }
        return nums;
    }
}