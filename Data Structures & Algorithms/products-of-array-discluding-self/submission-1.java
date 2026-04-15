class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;

        int[] pre = new int[len];
        pre[0] = 1;
        for (int idx = 1; idx < len; idx++) 
            pre[idx] = pre[idx - 1] * nums[idx - 1];

        int[] post = new int[len];
        post[len - 1] = 1;
        for (int idx = len - 2; idx > -1; idx--) 
            post[idx] = post[idx + 1] * nums[idx + 1];

        int[] res = new int[len];
        for (int idx = 0; idx < len; idx++) 
            res[idx] = pre[idx] * post[idx];

        return res;
    }
}  
