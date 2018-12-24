package com.stackroute;

public class EvenOdd {
    public static String Evenodd(int n){
        if(n%2==0 && n>20 && n<30){
            return "Jerry";
        }
        else if(n%2!=0 && n>20 && n<30){
            return "Tom";
        }
        else{
             return "Invalid input";
        }
    }
}
