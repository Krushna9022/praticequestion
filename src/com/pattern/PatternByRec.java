package com.pattern;

public class PatternByRec {
    public static void main(String[] args) {
        pattern(5,5);
    }
    public static void pattern(int i,int j)
    {
        if(i!=0)
        {
            System.out.print("*");
            pattern(i-1,j);
        }
        else {
            System.out.println();
            pattern(5, j-1);
        }
    }
}
