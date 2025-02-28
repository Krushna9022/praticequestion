package com.arrays;

import java.util.Scanner;

public class SumSubArray {
    public static void main(String[] args) {
        int a[] = new int[5];
        int target = 9;
        System.out.println("enter the elements of Array");
        for (int i = 0; i < a.length; i++) {
            a[i] = new Scanner(System.in).nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            int sum = a[i];
            for (int j = i + 1; j < a.length; j++) {
                sum+=a[j];
                if(sum==target)
                {
                    for(int k=i;k<=j;k++)
                    {
                        System.out.print(a[k] +" ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
