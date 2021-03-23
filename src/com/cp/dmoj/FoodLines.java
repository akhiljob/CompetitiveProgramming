package com.cp.dmoj;

import java.util.Scanner;

public class FoodLines {
    public static void main(String[] args) {
        // write your code here
        // Using Scanner for Getting Input from User
        Scanner in = new Scanner(System.in);
//        System.out.println("Please enter the no of food lines and pending no of people ");
        //no of food lines
        int n = in.nextInt();
        // no of pending people in queue
        int m = in.nextInt();
//        System.out.println("No of food lines : "+n);
//        System.out.println("No of pending people : "+m);
        // Get the number of peoples present in current food lines
        int foodLines[] = new int[n];
        for(int i = 0; i<n;i++){
            foodLines[i] = in.nextInt();
        }
        printTheJoinedFoodLineLengths(foodLines, m);

    }
    // Print M lines, the ith of which being the length of the line that the ith person joined.
    public static void printTheJoinedFoodLineLengths(int[] foodLines, int m){
        for(int i=0;i<m;i++){
            int minLineIndex=0;
            int minLineLength=foodLines[0];
            for(int j=0;j< foodLines.length;j++){
                if(foodLines[j]<minLineLength){
                    minLineLength=foodLines[j];
                    minLineIndex=j;
                }
            }

                System.out.println(foodLines[minLineIndex]);
            foodLines[minLineIndex]=foodLines[minLineIndex]+1;


        }

    }
}
