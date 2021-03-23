package com.cp.Collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class CollectionQueue {
    // write your code here
    // Using Scanner for Getting Input from User
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the no of digits: ");
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
        queue.add(in.nextInt());
        }

        for (
                int i = 0;
                i < n; i++) {
            System.out.println("The queue popped number is " + queue.poll());
        }
    }

}
