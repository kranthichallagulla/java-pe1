package com.stackroute;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class EvenOddTest {
    @Test
    public void Evenoddtest(){
        EvenOdd eo=new EvenOdd();
        String result=eo.Evenodd(24);
        assertEquals("Jerry",result);
    }
}
