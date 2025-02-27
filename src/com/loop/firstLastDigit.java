package com.loop;

public class firstLastDigit {
    public static void main(String[] args) {
        int no=12345;
        int last=no%10;
        int divdend=1;
        int first=0;
        while(no>10)
        {
            no=no/10;
        }
        System.out.println(no+"\t"+last);
    }
}
