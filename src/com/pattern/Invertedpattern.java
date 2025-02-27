package com.pattern;

public class Invertedpattern {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i <= n; i++) {
            boolean flag = true;
            for (int j = 1; j <= (2 * 6) + 1; j++) {
                if (j >= i && j <= (n * 2) - i && flag) {
                    System.out.print("*");
                    flag = false;
                } else {
                    System.out.print(" ");
                    flag = true;
                }
            }
            System.out.println();
        }
    }
}
