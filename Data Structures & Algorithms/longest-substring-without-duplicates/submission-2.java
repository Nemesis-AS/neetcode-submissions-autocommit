class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;

        int left = 0;
        int right = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        while (right < s.length()) {
            char character = s.charAt(right);

            int idx = map.getOrDefault(character, -1);

            if (idx >= left) {
                left = idx + 1;
            }

            map.put(character, right);

            maxLength = Math.max(maxLength, (right - left) + 1);
            right++;
        }

        return maxLength;
    }
}
