package com.stackroute;
import java.util.Scanner;
import java.lang.String;
public class VowelCons {
    public String Vowelconsonant(String s){




        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
                    ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' ){
                System.out.println(ch+":vowel");
            }
            else{
                System.out.println(ch+":consonant");
            }

        }
        return s;
    }


}
