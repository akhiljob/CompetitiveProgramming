package com.cp.Goldman;
import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.function.*;
        import java.util.regex.*;
        import java.util.stream.*;
        import static java.util.stream.Collectors.joining;
        import static java.util.stream.Collectors.toList;

        /*
        Given a  number x and a range of y to z please find the count of all the numbers 'n' in that range ,
        such that product of the number 'n' and 'x' does not contain any digit from the number 'n'
        i/p
        2
        10
        15
        o/p
        4
         */


public class NonRepeatingDigitInProduct {



    // Complete the nonRepeatingDigitProductCount function below.
    static int nonRepeatingDigitProductCount(int x, int y, int z) {

        int[] digits = getDigits(x);
        int maxCount=0;
        for(int index=y+1;index<=z;index++){
            int flag=0;
            for(int i=0;i<digits.length;i++){
                if(isDigitPresent(index,digits[i])){
                    flag=1;
                    break;
                }
            }
            if(flag==1){
                continue;
            }
            maxCount++;
        }


        return maxCount;
    }

    static boolean isDigitPresent(int x, int d)
    {
        // real loop if d is present as digit
        while (x > 0)
        {
            if (x % 10 == d)
                break;

            x = x / 10;
        }

        // If loop broke
        return (x > 0);
    }

    static int[] getDigits(int N){
        int arr[]=new int[10];
        int i = 0;
        int j, r;

        // Till N becomes 0
        while (N != 0) {

            // Extract the last digit of N
            r = N % 10;

            // Put the digit in arr[]
            arr[i] = r;
            i++;

            // Update N to N/10 to extract
            // next last digit
            N = N / 10;
        }
        return arr;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("/home/akhiljob/test.txt")));

        int x = Integer.parseInt(bufferedReader.readLine().trim());

        int y = Integer.parseInt(bufferedReader.readLine().trim());

        int z = Integer.parseInt(bufferedReader.readLine().trim());

        int res = nonRepeatingDigitProductCount(x, y, z);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
