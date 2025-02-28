package com.arrays;

public class NextBiggest {
    public static void main(String[] args) {
        int a[] = new int[]{5, 3, 10, 9,10, 6,13};
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                System.out.println("next Biggest Element of " + a[i] + " is " + -1);
            }
            for (int j = i; j < a.length; j++) {
                if (a[j] > a[i]) {
                    System.out.println("next Biggest Element of " + a[i] + " is " + a[j]);
                    break;
                }

            }
        }
    }
}
