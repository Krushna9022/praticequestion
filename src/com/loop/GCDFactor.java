package com.loop;

public class GCDFactor {
    public static void main(String[] args) {
        int no1=36;
        int no2=44;
        int gcd=1;
        for(int i=1;i<=no1&& i<=no2;i++)
        {
            if(no1%i==0 && no2%i==0)
            {
                gcd=i;
            }
        }
        System.out.println(gcd);
        int lcm=(no2*no1)/gcd;
        System.out.println(lcm);
    }
}
