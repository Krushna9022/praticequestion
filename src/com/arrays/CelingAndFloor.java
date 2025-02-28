package com.arrays;

public class CelingAndFloor {
    public static void main(String[] args) {
        int a[] = new int[]{1, 2, 3, 6, 5};
        for(int i=0;i<a.length;i++)
        {
            celing(a,i);
            floor(a,i );

        }
    }

    private static void floor(int[] a, int x) {
        if(a[a.length-1]<x)
        {
            System.out.println(a[a.length-1]);
            return ;
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==x)
            {
                System.out.println(a[i]);
                return;
            }
            if(a[i]<=x && a[i]>x)
            {
                System.out.println(a[i]);
                return;
            }
        }
    }

    private static void celing(int[] a, int i) {
        if (i <= a[0]) {
            System.out.println(i + " positon " + a[0]);
            return;
        }
        for (int j = 0; j < a.length; j++) {
            if (a[j] == i) {
                System.out.println((j) + " positon " + a[j]);
                return;
            }
            if (i > a[j] && i <= a[j + 1]) {
                System.out.println((j + 1) + " positon " + a[j + 1]);
                return;
            }
        }
    }
}
