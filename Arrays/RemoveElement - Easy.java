/**
 * Question: 
 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
 * The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
 * Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
 * Change the array nums such that the first k elements of nums contain the elements which are not equal to val.
 * The remaining elements of nums are not important as well as the size of nums.
 * Return k.
 */

class Solution {
    public int removeElement(int[] nums, int val) {
        int k = nums.length;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == val){
                k--;
            } // If the element is equal to the value, decrement k
            else {
                nums[i - (nums.length - k)] = nums[i];
            } // If the element is not equal to the value, move the element to the left by k
        }
        return k;
    }
}