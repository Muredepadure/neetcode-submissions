class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        if (n == 1) return nums[0];
        if (n == 2) return Math.max(nums[0], nums[1]);

        // Case 1: consider houses [0 .. n-2] (exclude last)
        int[] mem1 = new int[n];
        mem1[0] = nums[0];
        mem1[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < n - 1; i++) { // stop at n-2
            mem1[i] = Math.max(nums[i] + mem1[i - 2], mem1[i - 1]);
        }
        int case1 = mem1[n - 2];

        // Case 2: consider houses [1 .. n-1] (exclude first)
        int[] mem2 = new int[n];
        mem2[1] = nums[1];
        if (n > 2) {
            mem2[2] = Math.max(nums[1], nums[2]);
        }
        for (int i = 3; i < n; i++) { // stop at n-1
            mem2[i] = Math.max(nums[i] + mem2[i - 2], mem2[i - 1]);
        }
        int case2 = mem2[n - 1];

        return Math.max(case1, case2);
    }
}
