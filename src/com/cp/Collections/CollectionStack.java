package com.cp.Collections;

import java.util.Scanner;
import java.util.Stack;

public class CollectionStack {
    // write your code here
    // Using Scanner for Getting Input from User
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the no of digits: ");
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            stack.push(in.nextInt());
        }

        for (
                int i = 0;
                i < n; i++) {
            System.out.println("The stack popped number is " + stack.pop());
        }
    }

}
