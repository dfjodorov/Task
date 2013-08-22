package com.ctco.cutslash.stringchanger;


public class Main {
    public static void main(String[] args) {
        StringChanger sc = new StringChanger();
        String output = sc.removeExcessiveSlashes("ab\\\ncd\\\nef");
        System.out.println(output);
    }
}
