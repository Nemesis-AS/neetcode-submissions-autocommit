class Solution {
    int[] mem;

    public int rob(int[] nums) {
        this.mem = new int[nums.length];

        if (nums.length == 1) return nums[0];

        for (int idx = 0; idx < this.mem.length; idx++) this.mem[idx] = -1;
        int sc1 = recurse(nums, 0, nums.length - 2);

        for (int idx = 0; idx < this.mem.length; idx++) this.mem[idx] = -1;
        int sc2 = recurse(nums, 1, nums.length - 1);

        return Math.max(sc1, sc2);
    }

    public int recurse(int[] nums, int idx, int max) {
        if (idx > max) return 0;

        if (this.mem[idx] == -1)
            this.mem[idx] = Math.max(nums[idx] + recurse(nums, idx + 2, max), recurse(nums, idx + 1, max));
        
        return this.mem[idx];
    }
}
