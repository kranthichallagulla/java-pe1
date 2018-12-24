package com.stackroute;


import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.lang.String;

import org.junit.Assert;
import org.junit.Test;

public class VowelConsTest {
    @Test
        public void Vowelconsonanttest() {
        VowelCons vc = new VowelCons();
       String result= vc.Vowelconsonant("ap");
      assertEquals("ap",result);

    }
}
