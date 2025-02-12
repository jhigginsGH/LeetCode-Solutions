/**
 * Question:
 * Given a signed 32-bit integer x, return x with its digits reversed.
 * If reversing x causes the value to go outside the signed 32-bit integer range [-2^31, 2^31 - 1], then return 0.
 */

class Solution {
    public int reverse(int x) {

        int reversed = 0;
        while (x != 0) {

            int digit = x % 10; // Get next digit

            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0; // handles havlue over the integer limit
            }
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0; // Handles values below the integer limit
            }
            reversed = (reversed * 10) + digit; // Move all digits 1 place to the left making room for the next digit
            x /= 10; // Remove processed digit from x

        }
        return reversed;
    }
       
}
