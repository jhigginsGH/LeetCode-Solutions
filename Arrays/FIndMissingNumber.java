/**
 * Question:
 * Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
 */

class Solution {
    public int missingNumber(int[] nums) {
        int missingNum = 0;
        // Test each number starting from 0 to the length of the array to see if it is in the array
        while (missingNum < nums.length) {
            boolean containsNum = false;
            for (int i : nums) {
                if (i == missingNum){
                    containsNum = true;
                    break;
                }
            }
            // If the array did not contain the number then return the missing number
            if (!containsNum){
                return missingNum;
            }
            // Otherwise, increment missingNum and test next number
            else{
                missingNum++;
            }
        }
        return missingNum;
    }
}