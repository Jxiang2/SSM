package org.jxiang.calculatorApp;

import java.util.Scanner;

public class ReadInput {
    public static String read() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input expression (for example: 4*3/2)");
        String inputLine = sc.nextLine();

        sc.close();
        return inputLine;
    }
}
