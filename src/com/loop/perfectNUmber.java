package com.loop;

public class perfectNUmber {
    public static void main(String[] args) {
        for(int i=1;i<=28;i++)
        {
            int sum=0;
            for(int j=1;j<i;j++)
            {
                if(i%j==0)
                {
                    sum+=j;
                }
            }
            if(sum==i)
            {
                System.out.print(i+"\t");
            }
        }
    }
}
