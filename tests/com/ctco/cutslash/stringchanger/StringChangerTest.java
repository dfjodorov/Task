package com.ctco.cutslash.stringchanger;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;


public class StringChangerTest {

    String input;
    String actual;
    String valid = "abcdef";
    StringChanger stringChanger = new StringChanger();

    @Test
    public void shouldReturnAValidStringIfPassedASimpleString() throws Exception {
        input = "abcdef";
        actual = stringChanger.removeExcessiveSlashes(input);
        assertEquals(actual, valid);
    }

    @Test
    public void shouldReturnAValidStringIfPassedAStringWithItemToRemove() throws Exception {
        input = "abcd\\\nef";
        actual = stringChanger.removeExcessiveSlashes(input);
        assertEquals(actual, valid);
    }

    @Test
    public void shouldReturnAValidStringIfPassedAStringWithItemsToRemove() throws Exception {
        input = "ab\\\ncd\\\nef";
        actual = stringChanger.removeExcessiveSlashes(input);
        assertEquals(actual, valid);
    }

    @Test
    public void shouldNotChangeStringWrongOrder() throws Exception {
        input ="abc\n\\def";
        actual = stringChanger.removeExcessiveSlashes(input);
        assertEquals(input,actual);

    }

    @Test
    public void shouldNotChangeStringOnlyTwoSlashes() throws Exception {
        input ="abc\\def";
        actual = stringChanger.removeExcessiveSlashes(input);
        assertEquals(input,actual);
    }

    @Test
    public void shouldNotChangeStringNoSlash() throws Exception {
        input ="abc\ndef";
        actual = stringChanger.removeExcessiveSlashes(input);
        assertEquals(input,actual);
    }

    @Test
    public void shouldRemoveOnlyOneRemovableCombination() throws Exception {
        input ="abc\\\\\\\\\\\\ndef";
        actual = stringChanger.removeExcessiveSlashes(input);
        assertEquals(input,actual);
    }

}
