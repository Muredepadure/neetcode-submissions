class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        if(n == 3 && nums[0] + nums[1] + nums[2] != 0) 
            return new ArrayList<>();
        List<List<Integer>> res =  new ArrayList<>();

        Arrays.sort(nums);
        for(int i = 0; i < n - 2; i++) {
            // System.out.println(nums[i]);
            if(i > 0 && nums[i] == nums[i - 1]) continue;

            int l = i + 1;
            int r = n - 1;
            while(l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if(sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    int lv = nums[l];
                    int rv = nums[r];
                    while(l < r && lv == nums[l]) l++;
                    while(l < r && rv == nums[r]) r--;
                }
                else if(sum > 0){
                    r--;
                } else {
                    l++;
                }
            }
        }

        return res;
    }
}
