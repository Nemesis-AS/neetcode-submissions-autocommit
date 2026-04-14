class Solution {
    int[] mem;
    static int MAX_VAL = 1000000;

    public int coinChange(int[] coins, int amount) {
        this.mem = new int[amount + 1];
        for (int idx = 0; idx < this.mem.length; idx++) this.mem[idx] = -1;

        int ans = getCoins(coins, amount);
        if (ans == MAX_VAL) return -1;
        return ans;
    }

    public int getCoins(int[] coins, int amount) {
        if (amount == 0) return 0;
        if (amount < 0) return MAX_VAL;

        if (this.mem[amount] == -1) {
            this.mem[amount] = MAX_VAL;
            for (int c: coins)
                this.mem[amount] = Math.min(this.mem[amount], 1 + getCoins(coins, amount - c));
        }
        return this.mem[amount];
    }
}
