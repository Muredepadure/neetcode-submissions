class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q = new PriorityQueue<>((a,b) -> b - a);
        for(int i = 0; i < stones.length; i++) {
            q.add(stones[i]);
        }
        while(q.size() > 1) {
            int s1 = q.poll();
            int s2 = q.poll();
            int c = Math.abs(s1 - s2);
            if(c > 0){
                q.add(c);
            }
        }
        if(q.size() == 1){
            return q.poll();
        } else{
            return 0;
        }
    }
}
