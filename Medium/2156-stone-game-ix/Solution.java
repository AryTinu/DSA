class Solution {
    public boolean stoneGameIX(int[] stones) {
        int total = 0;
        for(int sum : stones){
            total += sum;
        }

        if(total%3==0){
            return true;
        }
        return false;
    }
}