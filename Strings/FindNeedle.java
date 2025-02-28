/**
 * Question:
 * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack
 */

class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack.contains(needle)){
            return haystack.indexOf(needle); // Returns first index of the substring
        }
        else{
            return -1;
        }
    }
}