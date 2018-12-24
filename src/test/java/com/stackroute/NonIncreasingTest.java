package com.stackroute;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class NonIncreasingTest {
    @Test
    public void Nonincreasing(){
        NonIncreasing ni=new NonIncreasing();
        boolean result=ni.Decreasing(2341);
        assertEquals(false,result);
    }
}
