package com.stackroute;
public class Letters {
    public static String LettersMethod(char ch){
        if(ch>=65 && ch<=90)

        {
            return "Upper case letter";

        }
        else if(ch>=97 && ch<=122)

        {
            return "Lower case letter";

        }
        else if(ch>=48 && ch<=57)

        {

            return "Digit";

        }
        else if((ch>=0 && ch<=47) || (ch>=58&& ch<=64) || (ch>=91 && ch<=96) || (ch>=123 && ch<=127))

        {
            return "Special symbol";

        }
        else{
            return "Invalid Input";
        }

    }
}
