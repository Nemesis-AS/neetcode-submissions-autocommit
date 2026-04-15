class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int n: nums) {
            int v = map.getOrDefault(n, 0);
            map.put(n, v + 1);
        }

        int[] res = new int[k];
        int[] counts = new int[k];
        for (Map.Entry<Integer, Integer> e: map.entrySet()) {
            Integer val = e.getValue();

            for (int idx = 0; idx < k; idx++) {
                if (counts[idx] < val) {
                    for (int i = k - 1; i > idx; i--) {
                        counts[i] = counts[i - 1];
                        res[i] = res[i - 1];
                    }
                    counts[idx] = val;
                    res[idx] = e.getKey();
                    break;
                }
            }
        }

        return res;
    }
}
