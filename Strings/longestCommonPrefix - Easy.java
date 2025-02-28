/**
 * Question: Write a function to find the longest common prefix string amongst an array of strings.
 */

class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder lcp = new StringBuilder("");// Initialise empy string

        for (int i = 0; i < strs[0].length(); i++) { // Process based on the first word in the array
            char letter = strs[0].charAt(i);
            for (String word : strs) {
                if (word.length() <= i || word.charAt(i) != letter){
                    return lcp.toString();
                }
            }
            lcp.append(letter);
        }
        return lcp.toString();
    }
}