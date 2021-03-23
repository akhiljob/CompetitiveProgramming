package com.cp;

import java.util.Scanner;

public class SortSquares
{

    public static void main(String[] args) {
	// write your code here
        // Using Scanner for Getting Input from User
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the no of digits: ");
        int n = in.nextInt();
        System.out.println("Please enter "+n+" numbers");
        int inputNumbers[] = new int[n];
        for(int i = 0; i<n;i++){
            inputNumbers[i] = in.nextInt();
        }
        int[] sortedNumbers = getSortedSquaredNumbers(inputNumbers);
        for(int i = 0; i<n;i++){
            System.out.println("The accepted array number is "+sortedNumbers[i]);
        }
    }

    /**
     * Function to return the sorted array of the squares of the numbers in the given array
     * @param numbers The array containing the base numbers
     * @return squaredNumbers The sorted array containing Squares of the above mentioned array members
     */
    private static int[] getSortedSquaredNumbers(int[] numbers ){

        int leftIndex=0; int rightIndex=numbers.length-1;
        int[] sortedSquaredNumbers= new int[numbers.length];
        int resultIndex=numbers.length-1;
        while(rightIndex>=leftIndex){
            if(numbers[leftIndex]*numbers[leftIndex]>numbers[rightIndex]*numbers[rightIndex]){
                sortedSquaredNumbers[resultIndex--]= numbers[leftIndex]*numbers[leftIndex];
                leftIndex++;
            }else{
                sortedSquaredNumbers[resultIndex--]=numbers[rightIndex]*numbers[rightIndex];
                rightIndex--;
            }
        }
        return sortedSquaredNumbers;
    }
}
