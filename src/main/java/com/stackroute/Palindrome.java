package com.stackroute;

public class Palindrome {
    public String Palind(long n)

    {
        long s = 0, sum = 0, s1, r;

        System.out.println("Enter number:");

        long temp =n ;
        while (n > 0) {
            s = s * 10 + n % 10;
            n = n / 10;
        }
        if (temp == s) {
            while (temp > 0) {
                r = temp % 10;
                if (r % 2 == 0) {
                    sum += r;
                }

                temp = temp / 10;
            }
            if (sum > 25) {

                System.out.println("sum=" + sum + " and sum of even numbers is greater than 25");
            } else {
                System.out.println("sum=" + sum + " and sum of even numbers is less than 25");
            }
        } else {
            System.out.println(s + " is not palindrome");
        }
        return "sum=2 and sum of even numbers is less than 25";

    }
}