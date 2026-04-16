class Solution {
    static int LENGTH_L = 3;

    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();

        for (String s: strs) {
            int len = s.length();
            
            if (len == 0) {
                res.append("000");
                continue;
            }

            int d = (int)Math.log10(len) + 1;
            for (int i = 0; i < LENGTH_L - d; i++) res.append("0");
            res.append(len);
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
