class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length-1;
        int expt = n*(n+1) / 2 ;
        int ans = 0 ;
        for(int i = 0 ; i <= nums.length-1 ; i++){
            ans += nums[i];
        }

        return expt-ans;
    }
}