class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;

        int[] pre = new int[len];
        pre[0] = nums[0];
        for (int idx = 1; idx < len; idx++) pre[idx] = pre[idx - 1] * nums[idx];

        int[] post = new int[len];
        post[len - 1] = nums[len - 1];
        for (int idx = len - 2; idx > -1; idx--) post[idx] = post[idx + 1] * nums[idx];

        int[] res = new int[len];
        res[0] = post[1];
        res[len - 1] = pre[len - 2];
        for (int idx = 1; idx < len - 1; idx++) res[idx] = pre[idx - 1] * post[idx + 1];

        return res;
    }
}  
