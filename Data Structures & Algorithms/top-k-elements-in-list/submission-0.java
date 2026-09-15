class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        List<Integer>[] freq = new List[nums.length + 1];
        for(int i = 0; i < freq.length; i++){
            freq[i] = new ArrayList<>();
        }

        for(int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            freq[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];
        int j = 0;
        for(int i = freq.length - 1; i > 0 && j < k; i--) {
            if(freq[i].size() >= 1){
                for(int p = 0; p < freq[i].size(); p++){
                    res[j] = freq[i].get(p);
                    j++;
                }
            }
            
        }
        return res;
    }
}
