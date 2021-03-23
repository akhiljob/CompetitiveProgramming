//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.regex.*;
//
//
//class Solution {
//
//    /*
//     * Complete the 'calculatePossibleCombinations' function below.
//     *
//     * The function is expected to return a LONG_INTEGER.
//     * The function accepts STRING inputStr as parameter.
//     */
//
//    public static long calculatePossibleCombinations(String inputStr) {
//
//        int index=0;
//        long possibleWords = 0;
//        while(inputStr!=null && index<inputStr.length()){
//            if(inputStr.charAt(index)>2||(inputStr.charAt(index)==1&&index==inputStr.length()-1)||
//                    (inputStr.charAt(index)==2&&index==inputStr.length()-1)){
//                possibleWords = 1* calculatePossibleCombinations(inputStr.substring(index+1));
//            }else if(inputStr.charAt(index)==2&&(index<inputStr.length()-1)&&inputStr.charAt(index+1)>6){
//                possibleWords = 1* calculatePossibleCombinations(inputStr.substring(index+1));
//            }else if((inputStr.charAt(index)==1 &&inputStr.charAt(index+1)!=0 &&  index<inputStr.length()-1) ||
//                    (inputStr.charAt(index)==2 && inputStr.charAt(index+1)<=6&&inputStr.charAt(index+1)!=0 &&index<inputStr.length()-1)){
//                possibleWords = (1* calculatePossibleCombinations(inputStr.substring(index+1)))+
//                        (1* calculatePossibleCombinations(inputStr.substring(index+2)));
//            }else if((inputStr.charAt(index)==1 &&inputStr.charAt(index+1)==0 &&  index<inputStr.length()-1) ||
//                    (inputStr.charAt(index)==2 && inputStr.charAt(index+1)<=6&&inputStr.charAt(index+1)==0 &&index<inputStr.length()-1)){
//                possibleWords = (1*calculatePossibleCombinations(inputStr.substring(index+2)));
//            }
//            return possibleWords;
//        }
//
//        return 1;
//    }
//
//}
//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        String inputStr = bufferedReader.readLine();
//
//        long result = Result.calculatePossibleCombinations(inputStr);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
//}
