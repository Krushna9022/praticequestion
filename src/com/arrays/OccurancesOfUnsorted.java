package com.arrays;

public class OccurancesOfUnsorted {
    public static void main(String[] args) {
        int a[]=new int[]{1,2,2,4,9,2,4,5,9};
        boolean b[]=new boolean[a.length];
        for(int i=0;i<a.length;i++)
        {
            int count=1;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    count++;
                    b[j]=true;
                }
            }
            if(!b[i])
            {
                System.out.println(a[i]+"=========>"+count);
            }
        }
    }
}
