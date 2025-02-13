/**
 * Question:
 * You are given a 0-indexed array nums consisting of positive integers.
 * You can choose two indices i and j, such that i != j, and the sum of digits of the number nums[i] is equal to that of nums[j].
 * Return the maximum value of nums[i] + nums[j] that you can obtain over all possible indices i and j that satisfy the conditions.
 */

 class Solution {
    public int maximumSum(int[] nums) {
        int largestSum = -1;
        int iCounter = 0;

        for (int i : nums) {
            int jCounter = 0;
            int temp = i;
            int iSum = 0;

            while (temp > 0){
                iSum += (temp % 10);
                temp /= 10;
            }          
            System.out.println("iSum: " + iSum);  
            for (int j : nums) {
                int temp2 = j;
                int jSum = 0;
                
                while (temp2 > 0 && iCounter != jCounter){
                    jSum += (temp2 % 10);
                    temp2 /= 10;
                }
                System.out.println("jSum: " + jSum);
                if (iSum == jSum && largestSum < (i + j)){
                    largestSum = i + j;
                }
                jCounter++;
            }
            iCounter++;
        }
        return largestSum;
    }
}