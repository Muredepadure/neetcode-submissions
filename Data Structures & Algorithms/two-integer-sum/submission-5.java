class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> map = new HashMap<>(); //val -> index
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++) {
            int dif = target - nums[i];
            if(map.containsKey(dif) && map.get(dif) != i) {
                return new int[]{i, map.get(dif)};
            }
        }
        return new int[0];
    }
}
