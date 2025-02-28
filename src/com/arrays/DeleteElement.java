package com.arrays;

import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int a[]={2,3,4,5,6,7};
        System.out.println("enter the element to delete");
        int element=new Scanner(System.in).nextInt();
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==element)
            {
                a[i]=a[i+1];
            }
        }
        for(int i=0;i<a.length-1;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
