package com.stackroute;

import org.junit.Test;
import java.lang.String;
import static org.junit.Assert.assertEquals;
public class PalindromeTest {
    @Test
    public void Palindtest(){
        Palindrome pd=new Palindrome();
       String result = pd.Palind(121);
       assertEquals("sum=2 and sum of even numbers is less than 25",result);

    }
}
