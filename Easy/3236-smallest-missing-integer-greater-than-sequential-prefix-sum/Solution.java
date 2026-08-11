class Solution {
    public int missingInteger(int[] nums) {
        int as = 0;
        for(int i = 0 ; i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                as += nums[i];
            }
        }
        return as;   
    }
}