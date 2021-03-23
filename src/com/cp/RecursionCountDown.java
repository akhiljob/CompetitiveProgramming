package com.cp;

import java.util.*;

public class RecursionCountDown {
    // write your code here
    // Using Scanner for Getting Input from User
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the countdown length: ");
        int n = in.nextInt();
        countdown(n);

    }


    public static void countdown(int n){
        // breaking condition for recursive fn to stop - must
        if(n==0) {
            System.out.println("....Done !!");
            return;
        }
        System.out.print(n+",");
        countdown(n-1);
        return;
    }
}
