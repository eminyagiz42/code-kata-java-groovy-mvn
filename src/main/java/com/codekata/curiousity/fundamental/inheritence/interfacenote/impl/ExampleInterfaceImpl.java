package com.codekata.curiousity.fundamental.inheritence.interfacenote.impl;

import com.codekata.curiousity.fundamental.inheritence.interfacenote.ExampleInterface;

/**
 * The type Example interface.
 */
public class ExampleInterfaceImpl implements ExampleInterface {

    @Override
    public int addition(int a, int b) {
        return a + b;
    }

    @Override
    public int subtraction(int a, int b) {
        return a - b;
    }
}
