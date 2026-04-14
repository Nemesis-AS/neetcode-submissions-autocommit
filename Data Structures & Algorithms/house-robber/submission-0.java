class Solution {
    int[] mem;

    public int rob(int[] nums) {
        this.mem = new int[nums.length + 1];
        for (int idx = 0; idx < mem.length; idx++) mem[idx] = -1;

        return recurse(nums, 0);
    }

    public int recurse(int[] nums, int idx) {
        if (idx >= nums.length) return 0;

        if (this.mem[idx] == -1)
            this.mem[idx] = Math.max(nums[idx] + recurse(nums, idx + 2), recurse(nums, idx + 1));
        
        return this.mem[idx];
    }
}
