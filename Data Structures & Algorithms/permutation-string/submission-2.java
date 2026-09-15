class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        int s = s1.length();
        int l = 0;
        int r = l + s; 
        while(r <= s2.length()) {
            String substring = s2.substring(l, r);
            if(isPermutation(s1, substring)) {
                return true;
            }
            l++;
            r++;
        }
        return false;
    }

    public boolean isPermutation(String s1, String s2) {
        int[] freq = new int[26];

        for (char c : s1.toCharArray()) {
            freq[c - 'a']++;
        }

        for (char c : s2.toCharArray()) {
            freq[c - 'a']--;
        }

        for(int i = 0; i < 26; i++){
            if(freq[i] != 0) return false;
        }
        return true;
    }
}
