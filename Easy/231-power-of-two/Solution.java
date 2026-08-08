class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1) return true;
        int s = n ;
        int two = 2;
        while(s!=0){
            two *=2;
            s--;

            if(n%2==0){
                return true;
            }
        }
        return false;
    }
}