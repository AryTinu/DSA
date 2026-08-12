class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer,Integer> ans = new HashMap<>();
        int as = 0;
        int left =0;

        for(int right = 0 ;right<nums.length ; right++){
            
            int need = target - nums[right]; 
            if(ans.containsKey(need)){
                return new int[]{ans.get(need),right};
            }
            ans.put(nums[right] , right);
        }
        return new int[]{};
    }
}