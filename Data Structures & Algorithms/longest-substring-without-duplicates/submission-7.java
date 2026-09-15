class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> last = new HashMap<>();
        int max = 0, l = 0;

        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            if (last.containsKey(c) && last.get(c) >= l) {
                // move left just past the previous occurrence
                l = last.get(c) + 1;
            }
            last.put(c, r);
            max = Math.max(max, r - l + 1);
        }
        return max;
    }
}
