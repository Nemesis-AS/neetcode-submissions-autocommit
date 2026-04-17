class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        
        for (String s: strs) {
            int[] h = new int[26];
            for (char c: s.toCharArray()) h[c - 'a'] += 1;

            String[] st = new String[26];
            for (int idx = 0; idx < 26; idx++) st[idx] = String.valueOf(h[idx]);
            String key = String.join(":", st);

            List<String> val = map.getOrDefault(key, new ArrayList<String>());
            val.add(s);
            map.put(key, val);
        }

        List<List<String>> res = new ArrayList<>();
        for (List<String> s: map.values()) res.add(s);
        return res;
    }
}
