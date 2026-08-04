class Solution {
    public int reverse(int x) {
        int n = x;
        long digit = 0;  // use long for safety

        while (n != 0) {
            int rev = n % 10;
            digit = digit * 10 + rev;
            n = n / 10;
        }

        // Final range check
        if (digit < Integer.MIN_VALUE || digit > Integer.MAX_VALUE) {
            return 0; // overflow
        }

        return (int) digit;
    }
}