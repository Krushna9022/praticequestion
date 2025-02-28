package com.arrays;

public class KthLargestElement {
    public static void main(String[] args) {
        int n=2;
        int a[]={1,4,2,5,5,5};
        int max=Integer.MIN_VALUE;
        int maxIndex=-1;
        while(n>0)
        {
            max=Integer.MIN_VALUE;
            for(int i=0;i<a.length;i++)
            {
                if(a[i]==max)
                {
                    a[i]=Integer.MIN_VALUE;
                }
                if(a[i]>max)
                {
                    max=a[i];
                    maxIndex=i;
                }
            }
            if(maxIndex!=-1)
            {
                a[maxIndex]=Integer.MIN_VALUE;
            }
            n--;
        }
        System.out.println(max);
    }
}
