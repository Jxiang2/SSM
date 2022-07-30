package org.jxiang.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListCollections {
    public static void main(String[] args) {
        // ArrayList: dynamic array, like JS array
        List<Integer> arrayList = new ArrayList<>(5);
        System.out.println(arrayList.getClass());

        // add
        for (int i = 1; i <= 5; i++) {
            arrayList.add(i);
        }
        System.out.println(arrayList);

        // remove
        arrayList.remove(3);
        System.out.println(arrayList);

        // get & iterate
        for (int i : arrayList) {
            System.out.print(i + " ");
        }
        System.out.println();

        // reset elements
        int indexToRemove = arrayList.indexOf(5);
        arrayList.set(indexToRemove, 999);
        System.out.println(arrayList);


        // LinkedList: order is important & can't randomly access elements
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("A");
        linkedList.add("B");

        // linkedList's special methods
        linkedList.addLast("C");
        linkedList.addFirst("D");
        linkedList.removeLast();
        linkedList.removeFirst();

        linkedList.add(2, "E");

        System.out.println(linkedList);



    }
}
