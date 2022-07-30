package org.jxiang.calculatorApp;

public class Add implements Operate  {

    @Override
    // varargs: they are converted to an array
    public Double getResult(Double... numbers) {
        Double result = 0.0;

        for (Double num: numbers) {
            result += num;
        }
        return result;
    }
}
