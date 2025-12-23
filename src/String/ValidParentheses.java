package String;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.add(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                if (c == ')') {
                    if (stack.pop() != '(') {
                        return false;
                    }
                }

                if (c == '}') {
                    if (stack.pop() != '{') {
                        return false;
                    }
                }

                if (c == ']') {
                    if (stack.pop() != '[') {
                        return false;
                    }
                }
            }
        }

        return stack.isEmpty();
    }
}
