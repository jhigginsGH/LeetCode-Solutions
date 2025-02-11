/**
 * Question: 
 * Given two strings s and part, perform the following operation on s until all occurrences of the substring part are removed:
 * Find the leftmost occurrence of the substring part and remove it from s.
 * Return s after removing all occurrences of part.
 */

class Solution {
    public String removeOccurrences(String s, String part) {
        while(s.contains(part)){//While the string contains the part
            s = s.replaceFirst(part, "");//Removes the part from the string
        }
        return s;
    }
}