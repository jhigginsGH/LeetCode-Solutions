/**
 * Question: Given an integer x, return true if x is palindrome integer.
 */

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0){return false;}
        
        int reversed = 0; //Reversed list
        int original = x; //Original List

        while (x > 0){
            reversed = (reversed * 10) + (x % 10); // reversed * 10 moved the current numbers one to the left making room for the next number x % 10
            x = x / 10; //Update x
        }
        return (reversed == original);
    }
}