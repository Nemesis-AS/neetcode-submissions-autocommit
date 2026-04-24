class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        char left, right;

        while (start < end) {
            left = s.charAt(start);
            right = s.charAt(end);
            while (!Character.isLetterOrDigit(left) && start < end) {
                start++;
                left = s.charAt(start);
            }

            while (!Character.isLetterOrDigit(right) && start < end) {
                end--;
                right = s.charAt(end);
            }

            if (Character.toLowerCase(left) != Character.toLowerCase(right)) {
                System.out.println(left + " " + right);
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
