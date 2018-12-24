package com.stackroute;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringReverseTest {
    @Test
    public void StringReversetestmethod(){
        StringReverse sr=new StringReverse();
        String result=sr.Stringreverse("london");
        assertEquals("nodnol",result);

    }
}
