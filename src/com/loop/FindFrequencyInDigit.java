package com.loop;

public class FindFrequencyInDigit {
    public static void main(String[] args) {
       int no=12241155;
        for(int i=0;i<10;i++)
        {
            int count=0;
            for(int j=no;j!=0;j=j/10)
            {
                int rem=j%10;
                if(rem==i)
                {
                    count++;
                }
            }
            if(count!=0)
            System.out.println(i+"---> "+count);
        }
    }
}
