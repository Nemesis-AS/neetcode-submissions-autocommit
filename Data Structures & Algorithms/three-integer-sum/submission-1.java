class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();

        for (int idx = 0; idx < nums.length; idx++) {
            if (idx > 0 && nums[idx] == nums[idx - 1]) {
                continue;
            }

            int base = nums[idx];

            int left = idx + 1;
            int right = nums.length - 1;

            while (left < right && left < nums.length && right > -1) {
                int leftNum = nums[left];
                int rightNum = nums[right];

                if (leftNum + rightNum + base == 0) {
                    List<Integer> triplet = List.of(base, leftNum, rightNum);
                    result.add(triplet);
                    left++;
                    while (left < nums.length - 1 && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    right--;
                    while (right > 0 && nums[right] == nums[right + 1]) {
                        right--;
                    }
                } else if (leftNum + rightNum + base > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }

        return result;
    }
}
