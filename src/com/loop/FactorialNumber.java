package com.loop;

public class FactorialNumber {
    public static void main(String[] args) {
        int no=5,fact=1;
        for(int i=5;i>=1;i--)
        {
            fact=i*fact;
        }
        System.out.println(fact);
    }
}
