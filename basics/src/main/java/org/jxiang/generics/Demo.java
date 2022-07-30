package org.jxiang.generics;

public class Demo {
    public static void main(String[] args) {
        SingleGenericHolder<Integer> iObj = new SingleGenericHolder<>(10);
        System.out.println(iObj.getObj());
        SingleGenericHolder<String> sObj = new SingleGenericHolder<>("hello");
        System.out.println(sObj.getObj());

        DualGenericHolder<Integer, String> dual = new DualGenericHolder<>(11, "world");
        dual.display();
    }
}
