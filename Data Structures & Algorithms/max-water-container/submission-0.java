class Solution {
    public int maxArea(int[] heights) {
        int max = 0;

        int start = 0;
        int end = heights.length - 1;

        while (start < end) {
            int water = Math.min(heights[start], heights[end]) * (end - start);
            max = Math.max(water, max);

            if (heights[start] > heights[end]) {
                end--;
            } else {
                start++;
            }
        }

        return max;        
    }
}
