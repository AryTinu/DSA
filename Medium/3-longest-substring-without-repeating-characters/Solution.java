class Solution {
    public int lengthOfLongestSubstring(String s) {
    boolean freq[] = new boolean[128];
    int left = 0;
    int right = 0;
    int ans = 0;

    while(right<s.length()){
        char ch = s.charAt(right);

        if(!freq[ch]){
            freq[ch]=true;
            ans = Math.max(ans,right-left+1);
            right++;
        }else{
            freq[s.charAt(left)]=false;
            left++;
            }
        }
        return ans;   
    }
}