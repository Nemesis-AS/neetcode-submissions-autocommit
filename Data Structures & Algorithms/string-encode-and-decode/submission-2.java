class Solution {

    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();

        for (String s: strs) {
            int len = s.length();
            res.append(String.format("%03d", len));
            res.append(s);
        }

        return res.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();

        int idx = 0;
        while (idx < str.length()) {
            int len = Integer.parseInt(str.substring(idx, idx + 3));
            idx += 3;

            res.add(str.substring(idx, idx + len));
            idx += len;
        }

        return res;
    }
}
