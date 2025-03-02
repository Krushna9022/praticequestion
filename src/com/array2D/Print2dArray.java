package com.array2D;

import java.util.Scanner;

public class Print2dArray {
    public static void main(String[] args) {
        int a[][]=new int[3][2];
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                a[i][j]=new Scanner(System.in).nextInt();
            }
        }

        for(int i=0;i<a.length;i++)
        {
            for (int j = 0; j <a[i].length ; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
