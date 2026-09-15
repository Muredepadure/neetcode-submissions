class Solution {
    public int countSubstrings(String s) {
        if(s == null || s.length() == 0) return 0;
        if(s.length() == 1) return 1;
        int count = 0;

        for(int i = 0; i < s.length(); i++) {
            int index1 = i;
            int index2 = i;
            count++;
            while(index1 > 0 && index2 < s.length() - 1) {
                index1--;
                index2++;
                if(s.charAt(index1) == s.charAt(index2)) {
                    count++;
                } else {
                    break;
                }
            }
        }
        for(int i = 0; i < s.length() - 1; i++) {
            int index1 = i;
            int index2 = i + 1;
            if(s.charAt(index1) == s.charAt(index2)) {
                count++;
                while(index1 > 0 && index2 < s.length() - 1) {
                    index1--;
                    index2++;
                    if(s.charAt(index1) == s.charAt(index2)) {
                        count++;
                    } else {
                        break;
                    }
                }
            }
            
        }

        return count;
    }
}
