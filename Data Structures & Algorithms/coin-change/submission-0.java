class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] mem = new int[amount + 1];
        for(int i = 0; i < mem.length; i++){
            mem[i] = amount + 1;
        }
        mem[0] = 0;
        for(int i = 1; i <= amount; i++) {
            for(int j = 0; j < coins.length; j++) {
                if(coins[j] <= i){
                    mem[i] = Math.min(mem[i], mem[i - coins[j]] + 1);
                }
            }
        }
        if(mem[amount] > amount)
            return -1;
        else
            return mem[amount];
    }
}
