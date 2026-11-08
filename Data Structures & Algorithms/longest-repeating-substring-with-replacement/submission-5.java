class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int max = 0;
        int maxf = 0;

        int l = 0;
        int r = 0;
        while(l <= r && r < s.length()) {
            int length = r - l + 1;
            int rightIndex = s.charAt(r) - 'A';
            freq[rightIndex]++;
            maxf = Math.max(maxf, freq[rightIndex]);
            if(length - maxf <= k) {
                max = Math.max(max, length);
                r++;
            } else {
                int leftIndex = s.charAt(l) - 'A';
                freq[leftIndex]--;
                freq[rightIndex]--;
                l++;
            }
        }

        return max;
    }
}
