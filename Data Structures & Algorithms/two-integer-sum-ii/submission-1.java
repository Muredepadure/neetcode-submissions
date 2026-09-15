class Solution {
    public int[] twoSum(int[] numbers, int target) {
       int[] res = new int[2];
       int i = 0;
       int j = 0;
       while(true) {
        if(numbers[i] + numbers[numbers.length - j - 1] > target){
            j++;
        } else if(numbers[i] + numbers[numbers.length - j - 1] < target){
            i++;
        } else {
            res[0] = i + 1;
            res[1] = numbers.length - j;
            break;
        }
       }
       return res;
    }
}
