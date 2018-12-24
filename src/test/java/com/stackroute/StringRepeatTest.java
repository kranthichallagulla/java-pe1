package com.stackroute;
import org.junit.Test;
import static org.junit.Assert.*;
public class StringRepeatTest {
    @Test
    public void rep()
    {
        StringRepeat repeat = new StringRepeat();
        String result = repeat.Repeat("kranthi",2);
        assertEquals("kranthithithi",result);

    }
    @Test
    public void repFailure()
    {
        StringRepeat repeat = new StringRepeat();
        String result = repeat.Repeat("ktanthi",2);
        assertEquals("kranthithithi",result);

    }
}
