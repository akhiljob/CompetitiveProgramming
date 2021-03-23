package com.cp.Collections;

import java.util.*;

public class CollectionHashTable {
    // write your code here
    // Using Scanner for Getting Input from User
    public static void main(String[] args) {
        Hashtable<String,Integer> hashTable = new Hashtable<String,Integer>();

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the no of digits: ");
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            hashTable.put("Index "+i, in.nextInt());
        }

        for (
                int i = n;
                i > 0; i--) {
            System.out.println("The queue popped number is " + hashTable.get("Index "+(i-1)));
        }
    }

}
