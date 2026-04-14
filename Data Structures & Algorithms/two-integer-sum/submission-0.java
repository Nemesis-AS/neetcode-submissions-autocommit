class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int idx = 0; idx < nums.length; idx++) {
            int v = map.getOrDefault(target - nums[idx], Integer.MIN_VALUE);
            if (v > Integer.MIN_VALUE) return new int[] { v, idx };
            map.put(nums[idx], idx);
        }

        return new int[] { -1, -1 };
    }
}
