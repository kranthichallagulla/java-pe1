package com.stackroute;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IterationTest {
    @Test
    public void Iterartiontest() {
        Iteration it = new Iteration();
        int result = it.Iterationloop(5);
        assertEquals("1 2 2 3 3 3 4 4 4 4 5 5 5 5 5",result);
    }
}
