class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();
        for(char c : t.toCharArray()) {
            mapT.put(c, mapT.getOrDefault(c, 0) + 1);
        }
        
        int l = 0;
        int r = 0;
        int min = Integer.MAX_VALUE;
        String substring = "";

        while(r < s.length()) {
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) + 1);
            r++;
            while(isValid(map, mapT)) {
                if(min > r - l + 1){
                    min = r - l + 1;
                    substring = s.substring(l, r);
                }
                map.replace(s.charAt(l), map.get(s.charAt(l)) -1);
                l++;
            }
        }

        if(min == Integer.MAX_VALUE){
            return "";
        } else{
            return substring;
        }
    }   

    //Checks if map contains all the characters and their frequencies from mapT
    public boolean isValid(Map<Character, Integer> map, Map<Character, Integer> mapT) {
        for(Map.Entry<Character, Integer> entry : mapT.entrySet()) {
            if(map.containsKey(entry.getKey())) {
                if(map.get(entry.getKey()) < entry.getValue()) return false;
            } else {
                return false;
            }
        }
        return true;
    }
}
