class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();

        for(int i = 0; i < strs.length; i++) {
            int[] freq = new int[26];
            String word = strs[i];
            int len = word.length();
            for(int j = 0; j < word.length(); j++) {
                int index = word.charAt(j) - 'a';
                freq[index]++;
            }
            String key = Arrays.toString(freq);
            List<String> wordList = map.getOrDefault(key, new ArrayList<>());
            wordList.add(word);
            map.put(key, wordList);
        }

        for(String key: map.keySet()){
            list.add(map.get(key));
        }

        return list;
    }
}
