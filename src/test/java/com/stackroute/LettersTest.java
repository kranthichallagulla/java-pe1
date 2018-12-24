package com.stackroute;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LettersTest {
    @Test
    public  void Lettertest(){
          Letters ltr=new Letters();
          String result=ltr.LettersMethod('A');
          assertEquals("Upper case letter",result);

    }
}
