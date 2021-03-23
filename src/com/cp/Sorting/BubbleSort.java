package com.cp.Sorting;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class BubbleSort {
    // write your code here
    // Using Scanner for Getting Input from User
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the no of digits: ");
        int n = in.nextInt();
        System.out.println("Please enter " + n + " numbers");
        int inputNumbers[] = new int[n];
        for (int i = 0; i < n; i++) {
            inputNumbers[i] = in.nextInt();
        }
        int[] result = bubbleSort(inputNumbers);
//        for (int i = 0; i < n; i++) {
//            System.out.println("The modified array number is " + result[i]);
//        }
    }

    public static int[] bubbleSort(int[] inputNumbers) {
        // the larger no always bubbles up to top in one iteration (largest number at n after 1st iteration ,
        // second largest at n-1 at second iteration and so on)
        for (int i = 0; i < inputNumbers.length; i++) {
            for (int j = 0; j < (inputNumbers.length - i - 1); j++) {
                if (inputNumbers[j] > inputNumbers[j + 1]) {
                    int temp = inputNumbers[j + 1];
                    inputNumbers[j + 1] = inputNumbers[j];
                    inputNumbers[j] = temp;
                }
            }
System.out.println("The current array state at iteration "+i+" is "+ Arrays.toString(inputNumbers));
        }

        System.out.println("The final array state is "+ Arrays.toString(inputNumbers));
        return  inputNumbers;
    }

}
