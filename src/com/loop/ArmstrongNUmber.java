package com.loop;

public class ArmstrongNUmber {
    public static void main(String[] args) {
        for (int i = 1; i <= 153; i++) {
            int temp = i;
            int count = 0;
            while (temp != 0) {
                count++;
                temp /= 10;
            }
            temp = i;
            int sum = 0;
            while (temp != 0) {
                int rem = temp % 10;
                int res = 1;
                temp /= 10;
                for (int j = 1; j <= count; j++) {
                    res *= rem;
                }
                sum += res;
            }
            if (sum == i) {
                System.out.print(i+" ");
            }
        }
    }
}

