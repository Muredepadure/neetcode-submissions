class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        int max  = 0;

        for(int num : nums){
            if(!numSet.contains(num - 1)){
                int streak = 1;
                while(numSet.contains(num + 1)) {
                    streak++;
                    num++;
                }
                max = Math.max(max, streak);
            }
        } 
        return max;
    }
}
