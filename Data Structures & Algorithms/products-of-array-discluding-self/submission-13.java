class Solution {
    public int[] productExceptSelf(int[] nums) {
        boolean containsZero = false;
        int numberOfZeroes = 0;
        int n = nums.length;

        int[] res = new int[n];

        int product = nums[0];

        for(int i = 1; i < n; i++) {
            if(nums[i] == 0) {
                containsZero = true;
                numberOfZeroes++;
                continue;
            }
            product *= nums[i];
        }

        for(int i = 0; i < n; i++) {
            if(containsZero) {
                if(nums[i] == 0 && numberOfZeroes < 2) {
                    res[i] = product;
                }
                else{
                    res[i] = 0;
                }
            }
            else{
                res[i] = product / nums[i];
            }
        }
        return res;
    }
}  
