class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zeroesCount = 0;
        int product = 1;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){
                zeroesCount++;
                continue;
            }
            product *= nums[i];
        }

        for(int i = 0; i < nums.length; i++) {
            if(zeroesCount >= 2) {
                nums[i] = 0;
            }
            else if(zeroesCount > 0) {
                if(nums[i] == 0) {
                    nums[i] = product;
                }
                else{
                    nums[i] = 0;
                }
            }
            else{
                nums[i] = product / nums[i];
            }
        }
        return nums;
    }
}  
