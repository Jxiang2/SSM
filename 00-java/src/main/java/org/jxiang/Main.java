package org.jxiang;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // **array to List conversion
        String[] srcArr = {"c", "a", "b"};
        Arrays.sort(srcArr);

        // *create a dynamic ArrayList
        List<String> srcList = new ArrayList<>(Arrays.asList(srcArr));
        srcList.add("e");
        System.out.println(srcList);
        System.out.println(srcList.getClass());

        // *create a fixed List view of an array
        List<String> srcList1 = Arrays.asList(srcArr);
        System.out.println(srcList1);
        System.out.println(srcList1.getClass());


        // **List to array conversion
        List<String> srcList2 = Arrays.asList("a", "b", "c");

        // *generic List to array
        String[] srcArr2 = srcList2.toArray(new String[0]);
        System.out.println(srcArr2.length);

        // *ArrayList to array conversion
        List<String> srcList3 = new ArrayList<>(srcList2);
        String[] srcArr3 = srcList3.toArray(new String[0]);
        System.out.println(srcArr3.length);


        // **Map keys and values
        Map<Integer, String> dict = new HashMap<>();
        dict.put(0, "a");
        dict.put(1, "b");
        dict.put(2, "c");
        dict.put(3, "c");

        // *get a Set/List of Map keys/values
        Set<Integer> keys = dict.keySet();
        System.out.println(keys);
        List<String> srcList4 = new ArrayList<>(dict.values());
        System.out.println(srcList4);


        // **Convert 2d List (ArrayList, LinkedList...) to 2d array
        List<List<Integer>> mainList = new ArrayList<>();
        mainList.add(Arrays.asList(100, 200, 300));
        mainList.add(Arrays.asList(1000, 2000, 3000));

        Integer[][] mainArr = new Integer[mainList.size()][];
        for (int i=0 ; i<mainList.size(); i++) {
            List<Integer> row = mainList.get(i);
            mainArr[i] = row.toArray(new Integer[0]);
        }
        // use deepToString to print multi-dimensional array
        System.out.println(Arrays.deepToString(mainArr));


        // **down casting
        List<Boolean> list = new ArrayList<>(Arrays.asList(true, false));

        // *List to ArrayList
        ArrayList<Boolean> downList1 = (ArrayList<Boolean>) list;
        ArrayList<Boolean> downList2 = new ArrayList<Boolean>(list);
        System.out.println(downList1);
        System.out.println(downList2);

        // *List to linkedList (the only way)
        LinkedList<Boolean> downList3 = new LinkedList<>(list);
        System.out.println(downList3);


        // **split, join
        String s1 = "hello world!";
        String[] s1Arr = s1.split("");
        System.out.println(Arrays.toString(s1Arr));
        String s2 = String.join("", s1Arr);
        System.out.println(s2);


        // Coming to the point, the key difference between them is that getClass() only returns
        // true if the object is actually an instance of the specified class but an instanceof
        // operator can return true even if the object is a subclass of a specified class or interface in Java.

        // The int will be implicitly converted to a long,
        // which can always be done without any loss of information.

        Child c1 = new Child("xjy", 12);
        System.out.println(c1);
    }
}

class Parent {
    String name;
    Integer age;

    public Parent () {
        System.out.println("parent is constructed");
    }

    public Parent (String name, Integer age) {
        System.out.println("parent is constructed");
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Child extends Parent {

    public Child() {
    }

    public Child(String name, Integer age) {
        super(name, age);
        System.out.println("child is constructed");
    }


    @Override
    public String toString() {
        return "Child{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
