package com.stackroute;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class AddNumbersTest {
    @Test
    public void Numberstest(){
        AddNumbers nb=new AddNumbers();
        int result=nb.Numbers(4, new int[]{21, 14, 2, 4});
        assertEquals(41,result);
    }
}
