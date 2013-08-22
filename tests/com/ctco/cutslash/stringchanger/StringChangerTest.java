package com.ctco.cutslash.stringchanger;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;


public class StringChangerTest {

    private String input;
    private String actual;
    final String VALID = "abcdef";
    private StringChanger stringChanger = new StringChanger();

    @Test
    public void shouldReturnAValidStringIfPassedASimpleString(){
        input = "abcdef";
        actual = stringChanger.removeExcessiveSlashes(input);
        assertEquals(actual, VALID);
    }

    @Test
    public void shouldReturnAValidStringIfPassedAStringWithItemToRemove(){
        input = "abcd\\\nef";
        actual = stringChanger.removeExcessiveSlashes(input);
        assertEquals(actual, VALID);
    }

    @Test
    public void shouldReturnAValidStringIfPassedAStringWithItemsToRemove() {
        input = "ab\\\ncd\\\nef";
        actual = stringChanger.removeExcessiveSlashes(input);
        assertEquals(actual, VALID);
    }

    @Test
    public void shouldNotChangeStringWrongOrder(){
        input ="abc\n\\def";
        actual = stringChanger.removeExcessiveSlashes(input);
        assertEquals(input,actual);

    }

    @Test
    public void shouldNotChangeStringOnlyTwoSlashes(){
        input ="abc\\def";
        actual = stringChanger.removeExcessiveSlashes(input);
        assertEquals(input,actual);
    }

    @Test
    public void shouldNotChangeStringNoSlash()  {
        input ="abc\ndef";
        actual = stringChanger.removeExcessiveSlashes(input);
        assertEquals(input,actual);
    }

    @Test
    public void shouldRemoveOnlyOneRemovableCombination()  {
        input ="abc\\\\\\\\\\\\ndef";
        actual = stringChanger.removeExcessiveSlashes(input);
        assertEquals(input,actual);
    }
}
