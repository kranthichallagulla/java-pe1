package com.stackroute;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class GuessNumTest {
    @Test
 public void Guessnumbertest(){
        GuessNum gn=new GuessNum();

     String result=gn.Guessnumber(50);
     assertEquals("Number guessed is greater than the original number",result);
 }
}
