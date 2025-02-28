package com.arrays;

public class MissingElement {
    public static void main(String[] args) {
        int a[]={1,5,7,9};
        int n=a[a.length-1];
        boolean b[]=new boolean[n+1];
        for(int num:a)
        {
            b[num]=true;
        }
        for(int i=1;i<n;i++)
        {
            if(!b[i])
            {
                System.out.print(i+" ");
            }
        }
    }
}
