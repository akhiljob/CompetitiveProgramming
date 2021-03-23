package com.cp;

import java.util.Scanner;

public class DuplicateZeroes {
    public static void main(String args){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the no of digits: ");
        int n = in.nextInt();
        System.out.println("Please enter "+n+" numbers");
        int inputNumbers[] = new int[n];
        for(int i = 0; i<n;i++){
            inputNumbers[i] = in.nextInt();
        }
        int[] result = getModifiedArray(inputNumbers);
        for(int i = 0; i<n;i++){
            System.out.println("The modified array number is "+result[i]);
        }

    }

    private static int[] getModifiedArray(int[] inputNumbers){
int[] result=new int[inputNumbers.length]; int resultIndex = 0;
int i=0;
do {
    if(inputNumbers[i]==0){
        inputNumbers[i+1]=0;
        i=i+2;
    }else{
        i++;
    }

}while(i<inputNumbers.length-1);
     return result;
    }

}
/**
 Input:
 [1,0,2,3,0,4,5,0]
 Output:
 [1,0,0,3,0,0,5,0]
 Expected:
 [1,0,0,2,3,0,0,4]
 */