package com.loop;

public class StrongNumber {
    public static void main(String[] args) {
        for(int i=0;i<=
                145;i++)
        {
            int sum=0;
            int temp=i;
            while(temp!=0)
            {
                int rem=temp%10;
                int fact=1;
                temp/=10;
                for(int j=1;j<=rem;j++)
                {
                    fact*=j;
                }
                sum+=fact;
            }
            if(sum==i)
            {
                System.out.print(i+" ");
            }
        }
    }
}
