class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap <Integer , Integer> as = new HashMap<>();

        int ans = 0 ;
        int c = k ;
        int left = 0;
        for(int right = 0 ; right < nums.length ; right++){
            as.put(nums[right], as.getOrDefault(nums[right],0) + 1);

            while(as.get(nums[right])>k){
                as.put(nums[left] , as.get(nums[left])-1);
                left++;
                }
                ans = Math.max(ans , right - left + 1);
          }
        return ans;
     }
}