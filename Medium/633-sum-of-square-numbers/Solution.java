class Solution {
    public boolean judgeSquareSum(int c) {
        if (c==1) return true;
        
        for(int i = 0 ; i < c ;i++){
            for(int j = i ; j < c ; j++){  
                if((i*i+j*j)==c){
                    return true;
                }
            }
        }
        return false;
    }
}