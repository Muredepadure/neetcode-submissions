class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        int i = 0;
        int j = 1;
        Set<Character> set = new HashSet<>();
        set.add(s.charAt(0));
        int max = 1;

        while(j < s.length()) {
            if(set.add(s.charAt(j))){
                max = Math.max(max, set.size());
                j++;
            } else {
                set.remove(s.charAt(i));
                i++;
            }
        }

        return max;
    }
}
