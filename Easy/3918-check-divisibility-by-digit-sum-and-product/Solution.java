class Solution {
    public boolean checkDivisibility(int n) {
        int sym = 0 ;
        int x = n;
        int product = 1;
        while(x!=0){
            x = n%10;
            sym += x;
            product *= x;
            x = x/10;
        }
        while(n%sym==0 && n%product==0){
                return true;
            }

            return false;
    }
}