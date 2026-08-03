class Solution {
    public int maxArea(int[] height) {
        int l =0 ;
        int r =height.length-1;
        int ans =0;
        while(l<r){
            int len = r-l;
            int area = len*Math.min(height[r],height[l]);
            ans = Math.max(ans,area);
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return ans;
    }
}