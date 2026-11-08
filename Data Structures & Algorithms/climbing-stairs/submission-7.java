class Solution {
    public int climbStairs(int n) {
        if(n <= 2) {
            return n;
        }
        int[] mem = new int[n + 1];
        // Holds the nr of possible combinations to reach step n
        mem[0] = 0;
        mem[1] = 1;
        mem[2] = 2;
        for(int i = 3; i <= n; i++) {
            mem[i] = mem[i - 2] + mem[i - 1];
        }

        return mem[n];
    }
}
