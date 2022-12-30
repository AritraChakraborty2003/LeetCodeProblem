package LeetCodeProblems;

import java.util.Stack;

public class ValidParenthesis {
    public boolean isValid(String s) {
        //Stack Data Structure
        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stk.push(s.charAt(i));
            } else if (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']') {
                if (stk.size() == 0)
                    return false;
                else {
                    char match = stk.peek();
                    if ((match == '(' && s.charAt(i) == ')') || (match == '{' && s.charAt(i) == '}') || (match == '[' && s.charAt(i) == ']')) {
                        stk.pop();
                    } else {
                        return false;
                    }


                }

            }


        }

        if (stk.size() != 0)
            return false;

        return true;
    }


}
