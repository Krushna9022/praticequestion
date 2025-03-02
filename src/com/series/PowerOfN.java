package com.series;

public class PowerOfN {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            //int pow = 1;
            int res = 1;
            int base=2;
            for (int j = 1; j<= i; j++) {
               res*= base;
            }
            System.out.println(res);
        }
    }
}
