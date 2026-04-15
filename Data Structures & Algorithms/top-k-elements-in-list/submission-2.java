class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));

        for (int n: nums) {
            int v = map.getOrDefault(n, 0);
            map.put(n, v + 1);
        }

        int[] res = new int[k];
        for (Map.Entry<Integer, Integer> e: map.entrySet()) 
            queue.offer(e.getKey());

        for (int idx = 0; idx < k; idx++) 
            res[idx] = queue.poll();

        return res;
    }
}
