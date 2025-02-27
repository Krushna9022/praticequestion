package com.pattern;

public class PyramidNum {

    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            boolean flag = true;
            int a=i;
            for (int j = 1; j < 12; j++) {
                if (j <= 5 + i && j >= 7 - i) {
                    System.out.print(a +" ");
                    if(j<6)
                    {
                        a++;
                    }
                    else
                    {
                       a--;
                    }
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}


