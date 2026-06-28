class Solution {
    public int trap(int[] height) {
        int[] leftMax = new int[height.length];
        int[] rightMax = new int[height.length];
        int waterHeld = 0;

        for (int idx = 1; idx < height.length; idx++) {
            leftMax[idx] = Math.max(leftMax[idx - 1], height[idx - 1]);
        }

        for (int idx = height.length - 2; idx > -1; idx--) {
            rightMax[idx] = Math.max(rightMax[idx + 1], height[idx + 1]);
        }

        for (int idx = 0; idx < height.length; idx++) {
            waterHeld += Math.max(Math.min(leftMax[idx], rightMax[idx]) - height[idx], 0);
        }

        return waterHeld;
    }
}
