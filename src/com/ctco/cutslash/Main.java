package com.ctco.cutslash;


import com.ctco.cutslash.stringchanger.StringChanger;

public class Main {
    public static void main(String[] args) {
        StringChanger sc = new StringChanger();
        String output = sc.removeExcessiveSlashes("ab\\\ncd\\\nef");
        System.out.println(output);
    }
}
