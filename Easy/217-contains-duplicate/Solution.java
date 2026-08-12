class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> ans = new HashSet<>();

        for(int curr = 0; curr < nums.length ;curr++){

            if(ans.contains(nums[curr])){
                return true;
            }
            ans.add(nums[curr]);
         }   
        return false;
    }
}