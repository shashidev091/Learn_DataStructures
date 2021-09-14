package com.shashi.stacks;

import java.util.Stack;

public class Stacks {

    public boolean findBalancedString(String input) {
        Stack<Character> stack = new Stack<>();

        for (char ch: input.toCharArray()) {
            if (ch == '(' || ch == '{' ) {
                stack.push(ch);
            }

            if (ch == ')' || ch == '}' ) {
                stack.pop();
            }
        }

        return stack.empty();
    }
}
