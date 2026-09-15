class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        if(n == 3 && nums[0] + nums[1] + nums[2] != 0) 
            return new ArrayList<>();
        List<List<Integer>> res =  new ArrayList<>();
        Set<List<Integer>> seen = new HashSet<>();

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                for(int z = j + 1; z < n; z++){
                    if (nums[i] + nums[j] + nums[z] == 0) {
                        // Canonicalize the triplet so duplicates collapse
                        int[] t = new int[] { nums[i], nums[j], nums[z] };
                        Arrays.sort(t);
                        List<Integer> key = Arrays.asList(t[0], t[1], t[2]);

                        if (seen.add(key)) { // add returns false if already present
                            res.add(key);
                        }
                    }
                }
            }
        }

        return res;
    }
}
