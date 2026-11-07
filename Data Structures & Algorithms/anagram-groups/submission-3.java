class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(int i = 0; i < strs.length; i++) {
            int[] freq = new int[26];
            String word = strs[i];
            for(int j = 0; j < word.length(); j++) {
                int index = word.charAt(j) - 'a';
                freq[index]++;
            }
            String key = Arrays.toString(freq);
            List<String> wordList = map.getOrDefault(key, new ArrayList<>());
            wordList.add(word);
            map.put(key, wordList);
        }

        return new ArrayList<>(map.values());
    }
}
