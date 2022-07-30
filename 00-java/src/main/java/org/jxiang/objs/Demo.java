package org.jxiang.objs;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student("xjy", 21, "Edmonton");
        Student s2 = new Student("Xjy", 21, "Calgary");
        Student s3 = new Student("Xyy", 21, "Alberta");

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        Set<Student> set = new HashSet<>();
        set.add(s1);
        set.add(s1);  // no-op
        set.add(s2);  // no-op
        set.add(s3);
        System.out.println(set);
    }
}
