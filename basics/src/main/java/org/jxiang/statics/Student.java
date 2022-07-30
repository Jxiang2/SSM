package org.jxiang.statics;

/**
 * static methods can only access static variables/methods
 * instance methods can access both instance variables/methods and static variables/methods
 */

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
                ", address='" + this.address + '\'' +
                '}';
    }
}
