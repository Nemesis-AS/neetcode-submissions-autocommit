class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        
        for (int n: nums) set.add(n);

        int maxLen = 0;
        for (int n: nums) {
            if (!set.contains(n - 1)) {
                int v = n + 1;
                while (set.contains(v)) {
                    v++;
                }

                if (v - n > maxLen) maxLen = v - n;
            }
        }

        return maxLen;
    }
}
