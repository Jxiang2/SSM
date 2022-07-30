package org.jxiang.objs;

import java.util.Objects;

public class Student {

    private String name;
    private int age;
    private String address;

    static private final String COLLAGE = "University of Alberta";
    static private int studentNumber = 0;

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
        addStudent();
    }

    public static void addStudent() {
        studentNumber += 1;
        System.out.printf("The %s has %d students in total%n", COLLAGE, studentNumber);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + this.name + '\'' +
                ", age=" + this.age +
                '}';
    }

    // if 2 objects are equal, they must have the same hashcode
    // if 2 objects have the same hashcode, they are not necessarily equal
    // compare objects in hash collections: 1. compare hash codes; 2. if hash codes collides, compare using equals()


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getAge() == student.getAge() && getName().equalsIgnoreCase(student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName().toLowerCase(), getAge());
    }
}
