class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] mem = new int[cost.length + 1];
        for(int i = 2; i <= cost.length; i++) {
            mem[i] = Math.min(mem[i - 1] + cost[i - 1], mem[i - 2] + cost[i - 2]);
        }
        return mem[cost.length];
    }
}
