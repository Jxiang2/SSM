package org.jxiang.collections;

import java.util.*;

public class SetCollection {
    public static void main(String[] args) {
        // hashSet: uniqueness
        Set<String> hashSet = new HashSet<>();

        hashSet.add("F");
        hashSet.add("A");
        hashSet.add("C");
        hashSet.add("C");
        hashSet.add("B");

        System.out.println(hashSet);

        System.out.println("List contain A or not? " + hashSet.contains("A"));
        hashSet.remove("A");
        System.out.println("List contain A or not? " + hashSet.contains("A"));

        for (String item : hashSet){
            System.out.println(item);
        }


        // TreeSet: uniqueness and auto-sort
        Set<String> treeSet = new TreeSet<>();

        treeSet.add("C");
        treeSet.add("A");
        treeSet.add("B");
        treeSet.add("C");

        System.out.println("treeSet: "+treeSet);
    }
}
