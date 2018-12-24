package com.stackroute;

public class StringReverse {
    public static String Stringreverse(String s){
        int i;
        String s1="";
        for(i=s.length()-1;i>=0;i--){
            s1+=s.charAt(i);
        }
        System.out.println(s1);
        return s1;
    }

}
