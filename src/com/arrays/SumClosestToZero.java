package com.arrays;

public class SumClosestToZero {
    public static void main(String[] args) {
        int a[]=new int[]{8 ,44 ,63 ,-51 ,-35 ,19, 84, -69, 4 ,-46};
        int sum=a[0]+a[1];
        int ele1=a[0];
        int ele2=a[1];
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {

                if(Math.abs(a[i]+a[j])<Math.abs(sum))
                {
                    ele1=a[i];
                    ele2=a[j];
                    sum=a[i]+a[j];
                }

            }
        }
        System.out.println(ele2+"\t"+ele1);
    }
}
