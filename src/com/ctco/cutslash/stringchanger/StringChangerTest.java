package com.ctco.cutslash.stringchanger;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class StringChangerTest {

    String input;
    String actual;
    String expected = "abcdef";
    StringChanger stringChanger = new StringChanger();

    @Test
    public void test() throws Exception {
        input = "abcdef";
        actual = stringChanger.removeExcessiveSlashes(input);
        assertEquals(actual, expected);
    }


}
