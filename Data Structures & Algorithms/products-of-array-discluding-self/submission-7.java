class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];

        int n = nums.length;

        int[] prefix_prod = new int[nums.length];

        int[] suffix_prod = new int[nums.length];

        prefix_prod[0] = 1;

        suffix_prod[n-1] = 1;

        for(int i = 1; i < n; i++) {
            prefix_prod[i] = nums[i-1] * prefix_prod[i-1];
        }     

        for(int i = n - 2; i >= 0; i--) {
            suffix_prod[i] = nums[i+1] * suffix_prod[i+1];
        }

        for(int i = 0; i < nums.length; i++) {
            res[i] = prefix_prod[i] * suffix_prod[i];
        }

        return res;
    }
}  