class Solution {
    public void sortColors(int[] nums) {
        int redCount = 0;
        int whiteCount = 0;
        int blueCount = 0;

        for(int num : nums) {
            if(num == 0) {
                redCount++;
            }
            else if(num == 1) {
                whiteCount++;
            }
            else{
                blueCount++;
            }
        }

        int idx = 0;
        for(int i = 0; i < redCount; i++) {
            nums[idx] = 0;
            idx++;
        }

        for(int j = 0; j < whiteCount; j++) {
            nums[idx] = 1;
            idx++;
        }

        for(int k = 0; k < blueCount; k++) {
            nums[idx] = 2;
            idx++;
        }
    }
}