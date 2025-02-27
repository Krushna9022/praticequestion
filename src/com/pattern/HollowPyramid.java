package com.pattern;

public class HollowPyramid {
    public static void main(String[] args) {
        for(int i=1;i<=6;i++)
        {
            boolean flag=true;
            for(int j=1;j<12;j++)
            {
                if((i==6 ||j==6-i||j==5+i) && flag)
                {
                    System.out.print("*");
                    flag=false;
                }
                else
                {
                    System.out.print(" ");
                    flag=true;
                }
            }
            System.out.println();
        }
    }
}
