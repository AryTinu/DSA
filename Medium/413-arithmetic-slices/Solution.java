class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums.length<3) return 0;
        int count = 0;
        for(int i = 0 ; i<nums.length-2;i++){
            for(int j = 0 ; j<nums.length-1;j++){
                for(int k = 0 ; k<nums.length;k++){
                    if((nums[i]-nums[j])==(nums[j]-nums[k])){
                        count++;
                    }
                }
            }
        }
        return count-1;
    }
}