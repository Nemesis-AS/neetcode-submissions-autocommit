class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        
        for (String s: strs) {
            char[] h = new char[26];
            for (char c: s.toCharArray()) h[c - 'a'] += 1;

            String key = new String(h);
            List<String> val = map.getOrDefault(key, new ArrayList<String>());
            val.add(s);
            map.put(key, val);
        }

        List<List<String>> res = new ArrayList<>();
        for (List<String> s: map.values()) res.add(s);
        return res;
    }
}
