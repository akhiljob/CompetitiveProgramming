package com.cp;

import java.util.Scanner;
import java.util.Stack;

public class EuclidGCD {

    public static void main(String[] args) {
        // write your code here
        // Using Scanner for Getting Input from User
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter thetwo numbers for calculating GCD: ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();

        int result = getGCD(n1, n2);
        System.out.println("The result is : " + result);

    }

    /**
     * Function to return the GCD of two numbers
     * @param n1,n2 The numbers for which GCD is to be calculated
     * @return The GCD of n1 & n2
     */
    private static int getGCD(int n1, int n2) {
        int remainder, temp, result;

        while(n2>0){
            // calculate remainder of two numbers., if zero , the lowest number is GCD
            remainder = n1%n2;
            if(remainder==0){
                break;
            }
            // continue the procedure with the lowest number and remainder as next set of input till solution is reached
            n1=n2;
            n2=remainder;
        }

        return n2;
    }

}
