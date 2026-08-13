class Solution {
    public int maxJump(int[] stones) {
        int n = stones.length;
        return f(stones,n-1);
    }

    public int f(int[] arr , int n){
        if(n == 0) return 0;
        int m = Integer.MIN_VALUE;
        int l = f(arr,n-1) + Math.abs(arr[n] - arr[n-1]);
        int r = Integer.MIN_VALUE;
        if(r>1){
            int l = f(arr,n-2) + Math.abs(arr[n] - arr[n-2]);
        }
        m = Math.max(m,l,r);

        return m;
    }
}