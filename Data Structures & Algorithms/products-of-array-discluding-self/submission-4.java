class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l = nums.length;
        int[] leftPrefix = new int[l];
        int[] rightPrefix = new int[l];
        int leftProduct = 1;
        int rightProduct = 1;
        for(int i = 0; i < l; i++){
            leftProduct *= nums[i];
            leftPrefix[i] = leftProduct;
            rightProduct *= nums[l - i - 1];
            rightPrefix[l - i - 1] = rightProduct;
        }

        int[] res = new int[l];
        for(int i = 1; i < l - 1; i++) {
            res[i] = leftPrefix[i - 1] * rightPrefix[i + 1];
        }
        res[0] = rightPrefix[1];
        res[l - 1] = leftPrefix[l - 2];
        return res;
    }
}  
