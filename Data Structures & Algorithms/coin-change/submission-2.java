class Solution {
    int[] mem;
    static int MAX_VAL = 1000000;

    public int coinChange(int[] coins, int amount) {
        this.mem = new int[amount + 1];
        this.mem[0] = 0;

        for (int idx = 1; idx < this.mem.length; idx++) {
            this.mem[idx] = MAX_VAL;

            for (int c: coins) {
                if (idx - c > -1)
                    this.mem[idx] = Math.min(this.mem[idx], this.mem[idx - c] + 1);
            }
        }

        if (this.mem[amount] == MAX_VAL)
            return -1;
        return this.mem[amount];
    }
}
