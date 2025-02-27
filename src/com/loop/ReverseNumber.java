package com.loop;

public class ReverseNumber {
    public static void main(String[] args) {
        int no=65456;
        int temp=no;
        int rev=0;
        while(no!=0)
        {
            int rem=no%10;
          rev= rev*10+rem;
          no/=10;
        }
        System.out.println(rev);
        if(temp==rev)
        {
            System.out.println("numnber  is palindrome");

        }else {
            System.out.println("number  is not palindrome");
        }
    }
}
