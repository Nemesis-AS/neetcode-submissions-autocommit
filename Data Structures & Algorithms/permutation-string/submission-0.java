class Solution {
    int[] computeHash(String s, int start, int end) {
        int[] hash = new int[26];

        for (int idx = start; idx <= end; idx++) {
            hash[s.charAt(idx) - 'a'] += 1;
        }

        return hash;
    }

    public boolean checkInclusion(String s1, String s2) {
        int[] hash = computeHash(s1, 0, s1.length() - 1);
        int[] computed;

        int start = 0;
        int end = s1.length() - 1;

        while (end < s2.length()) {
            computed = computeHash(s2, start, end);

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
