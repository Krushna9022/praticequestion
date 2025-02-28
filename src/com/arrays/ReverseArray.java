package com.arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        int j=a.length-1;
        for (int i=0;i<a.length/2;i++,j--)
        {
            if(i<j)
            {
                a[i]=a[i]+a[j];
                a[j]=a[i]-a[j];
                a[i]=a[i]-a[j];
            }
        }
        for(int i:a)
        {
            System.out.print(i+" ");
        }
    }
}
