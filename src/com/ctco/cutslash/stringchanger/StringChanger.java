package com.ctco.cutslash.stringchanger;

public class StringChanger {

    public String removeExcessiveSlashes(String input) {

        input = input.replaceAll("\\\\" + "\\n", "");
        return input;
    }

}
