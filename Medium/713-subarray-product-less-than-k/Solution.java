class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        int ans = 0;

        for (int i = 0; i < nums.length; i++) {

            int product = 1;

            for (int j = i; j < nums.length; j++) {

                product *= nums[j];

                if (product < k)
                    ans++;
                else
                    break; // all numbers are positive
            }
        }

        return ans;
    }
}