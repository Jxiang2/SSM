package org.jxiang.calculatorApp;

public interface Operate {
    // numbers can be an array with arbitrary length
    Double getResult(Double... numbers);
}
