class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length < 2) return nums.length;
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int max = 1;
        
        for(int i = 0; i < nums.length; i++) {
            if(!set.contains(nums[i] - 1)) {
                int inc = 1;
                while(set.contains(nums[i] + inc)) {
                    inc++;
                    max = Math.max(max, inc);
                }
            }
        }

        return max;
    }
}
