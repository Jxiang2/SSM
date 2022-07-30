package org.jxiang.functionals.lambdaAndAIC;

public class TestLambdas {
    public static void main(String[] args) {
        // lambda example 1
        Printable lbdPrint = (p, s) -> System.out.println(p + "Meow" + s);
        lbdPrint.print("*", "!");

        // lambda example 2
        printThing((p, s) -> System.out.println(p + "Meow" + s));

        // by anonymous inner class, not recommended if
        // we have functional interface to be implemented
        Printable myPrintable = new Printable() {
            @Override
            public void print(String prefix, String suffix) {
                System.out.println(prefix + "Meow" + suffix);
            }
        };
        myPrintable.print("*", "!");
    }

    // lambda example 2
    static void printThing(Printable thing) {
        thing.print("*", "!");
    }
}
