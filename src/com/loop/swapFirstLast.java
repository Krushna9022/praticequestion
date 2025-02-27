package com.loop;

public class swapFirstLast {
    public static void main(String[] args) {
        int no=123456;
        int temp=no;
        int dividend=1;
        while(temp>10)
        {
            temp/=10;
            dividend*=10;
        }
        no=(no%10)*dividend+((no%dividend)/10)*10+no/dividend;
        System.out.println(no);
    }
}
