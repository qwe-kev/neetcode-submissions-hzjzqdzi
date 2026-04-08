class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;

        int[] output = new int[n];
        
        int[] prefix = new int[n];
        
        int[] postfix = new int[n];

        prefix[0] = nums[0];

        postfix[n-1] = nums[n-1];

        for(int i = 1; i < n; i++) {
            prefix[i] = prefix[i-1] * nums[i];
        }

        for(int i = n-2; i >= 0; i--) {
            postfix[i] = postfix[i+1] * nums[i];
        }

        for(int i = 0; i < n; i++) {
            if(i == 0) {
                output[i] = 1 * postfix[i+1];
            }
            else if(i == n-1) {
                output[i] = prefix[i-1] * 1;
            }
            else{
                output[i] = prefix[i-1] * postfix[i+1];
            }
        }

        return output;
    }
}  
