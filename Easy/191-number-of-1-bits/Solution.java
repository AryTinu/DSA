class Solution {
    public int hammingWeight(int n) {
    int num = n ;
    int count = 0 ;
    for(int i = 0 ; i < 32 ; i++){
            count += (num & 1);
            num = num >> 1;
        }
        return count;
    }
}