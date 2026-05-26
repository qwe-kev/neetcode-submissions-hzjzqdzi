class Solution {
    public int[] productExceptSelf(int[] nums) {
        boolean containsZero = false;
        int numOfZeroes = 0;
        int product = 1;

        int n = nums.length;
        int[] res = new int[n];

        for(int num : nums) {
            if(num == 0) {
                containsZero = true;
                numOfZeroes++;
                continue;
            }
            product *= num;
        }

        int idx = 0;

        for(int num : nums) {
            if(containsZero) {
                if(numOfZeroes >= 2) {
                    res[idx] = 0;
                    idx++;
                }
                else{
                    if(num != 0) {
                        res[idx] = 0;
                        idx++;
                    }
                    else{
                        res[idx] = product;
                        idx++;
                    }
                }
            }
            else{
                res[idx] = product / num;
                idx++;
            }
        }

        return res;
    }
}  
