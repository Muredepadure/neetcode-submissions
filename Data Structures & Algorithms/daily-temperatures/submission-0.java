class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        for(int i = 0; i < temperatures.length; i++) {
            int r = i;
            while(r < temperatures.length && temperatures[i] >= temperatures[r]) {
                res[i]++;
                r++;
                if(r == temperatures.length) res[i] = 0;
            }
        }
        return res;
    }
}
