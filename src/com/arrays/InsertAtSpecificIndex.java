package com.arrays;
import java.util.*;
public class InsertAtSpecificIndex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a[]=new int[7];
        System.out.println("enter the element of array..");
        for(int i=0;i<a.length-1;i++)
        {
          a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length-1;i++)
        {
            System.out.print(a[i]);
        }
        System.out.println("enter index to insert");
            int index=sc.nextInt();
            if(index<a.length)
            {
                System.out.println("enter the elemet to insert");
                int element=sc.nextInt();
                for(int i=a.length-1;i>=index;i--)
                {
                    a[i]=a[i-1];
                }
                a[index]=element;
            }
            else
            {
                System.out.println("index is not present");
            }
            for(int arr:a)
            {
                System.out.print(arr+" ");
            }
    }
}
