package org.jxiang.calculatorApp;

import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        String inputExp = ReadInput.read();
        if (inputExp.isEmpty()) {
            inputExp = "4*3/2";
        }

        Queue<String> operations;
        Queue<String> numbers;

        String[] numArr = inputExp.split("[-+*/]");
        String[] oprArr = inputExp.split("[0-9]+");

        // array - Arrays.asList(array) -> List - LinkedList(List) -> LinkedList
        numbers = new LinkedList<>(Arrays.asList(numArr));
        operations = new LinkedList<>(Arrays.asList(oprArr));

        // remove and return head of linkedList
        Double res = Double.parseDouble(numbers.poll());

        while (!numbers.isEmpty()) {
            String opr = operations.poll();

            Operate operate;
            switch (opr) {
                case "+":
                    operate = new Add();
                    break;
                case "-":
                    operate = new Subtract();
                    break;
                case "*":
                    operate = new Multiply();
                    break;
                case "/":
                    operate = new Divide();
                    break;
                default:
                    continue;
            }

            Double num = Double.parseDouble(numbers.poll());
            res = operate.getResult(res, num);
        }
        System.out.println(res);
    }
}
