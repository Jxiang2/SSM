package org.jxiang.excepts;

import java.io.FileReader;
import java.io.IOException;

public class ExceptionDemo {

    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = new FileReader("./src/com/jingyu/exceptions/file.txt");
            System.out.println("File opened");

            int values = reader.read();
            System.out.println(values);

            reader.close();
            System.out.println("File closed");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
