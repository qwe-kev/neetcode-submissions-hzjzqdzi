class Solution {
    public int maxArea(int[] height) {
        int res = 0;
        for(int i = 0; i < height.length - 1; i++) {
            for(int j = i + 1; j < height.length; j++) {
                int minSide = Math.min(height[i], height[j]);
                res = Math.max(res, minSide * (j - i));
            }
        }
        return res;
    }
}