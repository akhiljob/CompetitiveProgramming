package com.cp.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
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
        int[] result = mergeSort(inputNumbers, 0, inputNumbers.length-1);

            System.out.println("The modified array  is " + Arrays.toString(result));

    }

    public static int[] mergeSort(int[] inputNumbers, int left, int right) {

        if(left<right){
            // middle point of current window of array
            int mid= left + (right-left)/2;
            mergeSort(inputNumbers,left, mid);
            mergeSort(inputNumbers, mid+1, right);

        }

        return inputNumbers;
    }

}
