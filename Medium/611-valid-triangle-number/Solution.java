class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);

        int ans = 0;

        for (int first = 0; first < nums.length - 2; first++) {
            for (int second = first + 1; second < nums.length - 1; second++) {
                for (int third = second + 1; third < nums.length; third++) {

                    int chk = nums[first] + nums[second];

                    if (chk > nums[third]) {
                        ans++;
                    }
                }
            }
        }

        return ans;
    }
}