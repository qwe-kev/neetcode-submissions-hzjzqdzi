class Solution {
    public int maxArea(int[] heights) {
        int maxVol = Integer.MIN_VALUE;
        for(int i = 0; i < heights.length; i++) {
            for(int j = i + 1; j < heights.length; j++) {
                maxVol = Math.max(maxVol, (j - i) * Math.min(heights[i], heights[j]));
            }
        }
        return maxVol;
    }
}
