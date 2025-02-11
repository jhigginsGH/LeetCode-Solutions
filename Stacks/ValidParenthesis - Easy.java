/**
 * This program finds if the grouping symbols are in valid order. We start with a stack that holds all the grouping symbols.
 * Then we process each symbol by popping it from the stack. Closing symbols are pushed to stack 2.
 * When an opening symbol is encountered, we compare it to the closing symbol at the top of the second stack.
 * If the symbols form a valid pair, they are both popped from their stacks and we keep processing.
 * If the two symbols do not form a valid pair, then the order of the symbols is invalid and we return false.
 */

package Stacks;

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            stack1.push(s.charAt(i));//Create stack of all the grouping symbols
        }
        try{ //If peeking fails this means there were an odd number of symbols and therefor one pair is not complete and we return false.
            while (!stack1.empty()){//Process each grouping symbol
                switch (stack1.peek()) {
                    case ')':
                        stack2.push(stack1.pop());//Closing symbol moves to stack2
                        break;

                    case '(':
                        if (stack2.peek() == ')') {//Check stack2 for valid closing symbol counterpart, otherwise the pair is invalid.
                            stack1.pop();
                            stack2.pop();
                        } else {
                            return false;
                        }
                        break;

                    case '}':
                        stack2.push(stack1.pop());
                        break;

                    case '{':
                        if (stack2.peek() == '}') {
                            stack1.pop();
                            stack2.pop();
                        } else {
                            return false;
                        }
                        break;
                    case ']':
                        stack2.push(stack1.pop());
                        break;

                    case '[':
                        if (stack2.peek() == ']') {
                            stack1.pop();
                            stack2.pop();
                        } 
                        else {
                            return false;
                        }
                        break;
                }
            }
        }
        catch (Exception e){
            return false;
        }
        return (stack1.empty() == stack2.empty());//If both are not empty after processing then there were an odd number of symbols making it impossible for the grouping symbols to all have valid pairs.
    }
}