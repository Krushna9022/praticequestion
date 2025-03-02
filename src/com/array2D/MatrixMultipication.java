package com.array2D;
import java.util.*;
public class MatrixMultipication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element of array");
        int a[][]=new int[2][2];
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter the element of array");
        int b[][]=new int[2][2];
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        int c[][]=new int[2][2];

        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                c[i][j]=0;
                for(int k=0;k<2;k++)
                {
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        System.out.println("printing the multiplication of matrix");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
