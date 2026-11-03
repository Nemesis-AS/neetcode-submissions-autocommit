class Solution {
    void computeHash(String s, int start, int end, int[] out) {
        for (int idx = 0; idx < out.length; idx++) out[idx] = 0;
        for (int idx = start; idx <= end; idx++) {
            out[s.charAt(idx) - 'a'] += 1;
        }
    }

    public boolean checkInclusion(String s1, String s2) {
        int[] hash = new int[26];
        int[] computed = new int[26];

        computeHash(s1, 0, s1.length() - 1, hash);

        int start = 0;
        int end = s1.length() - 1;

        while (end < s2.length()) {
            computeHash(s2, start, end, computed);

            int idx = 0;
            for (; idx < hash.length; idx++) {
                if (computed[idx] != hash[idx]) {
                    break;
                }
            }

            if (idx == hash.length) return true;

            start++;
            end++;
        }

        return false;
    }
}
