class Solution {
    public int maxArea(int[] height) {
        int maximum = 0;
        int currentLength = height.length - 1;
        int l = 0;
        int r = height.length - 1;

        while(l < r) {
            int area = Math.min(height[l], height[r]) * currentLength;
            if(height[l] <  height[r]) {
                l++;
            } else {
                r--;
            }
            currentLength--;
            maximum = Math.max(maximum, area);
        }

        return maximum;
    }
}