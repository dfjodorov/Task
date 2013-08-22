package com.ctco.cutslash.stringchanger;

import static junit.framework.Assert.assertEquals;

public class StringChangerTest {
    String input ;
    String actual= "abcdef";
    StringChanger stringChanger = new StringChanger();

    @org.junit.Test
    public void testRemoveExcessiveSlashes() throws Exception {
        input = "abcdef";
        stringChanger.removeExcessiveSlashes(input);
        assertEquals(input,actual);
    }
}
