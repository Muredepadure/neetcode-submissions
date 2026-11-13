class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length < 2) return nums.length;
        Arrays.sort(nums);
        int currentMax = 1; 
        int max = 1; 
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i + 1] - 1 == nums[i]) {
                currentMax++;
                max = Math.max(max, currentMax);
            } else if(nums[i + 1] == nums[i]){
                continue;
            } else {
                currentMax = 1;
            }
        }
        return max;
    }
}
