class Solution {

    public int binary_search(int l, int r, int[] nums, int target) {
        int m = (l + r) / 2;

        if(l == r && nums[l] == target) return l;
        if(l == r && nums[l] != target) return -1;

        if(target < nums[m]) {
            return binary_search(l, m - 1, nums, target);
        } else if(target > nums[m]){
            return binary_search(m + 1, r, nums, target);
        } else {
            return m;
        }
    }

    public int search(int[] nums, int target) {
        if(nums.length == 2) {
            if(nums[0] == target) return 0;
            else if(nums[1] == target) return 1;
            else return -1;
        }
        return binary_search(0, nums.length - 1, nums, target);
    }
}
