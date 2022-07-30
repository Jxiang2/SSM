package org.jxiang.annotations;
import java.lang.annotation.*;
import java.lang.reflect.Field;

// ANNOTATIONS
// Meta-annotations: basic annotations to decorate other annotations\
// @Target: which entities this decorator applies to (Class, Method ...)
// @Retention: when this annotation takes effects (source: 编译前, class：编译后, runtime：运行时)

// REFLECTIONS
// def: get a Class, and it's full information from its instances
// 1 class has only 1 Class instance

public class TestAnnotations {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class<?> c1 = Class.forName("org.jxiang.annotations.MyStudent");

        Annotation[] annotations =  c1.getAnnotations(); // get all annotations in an array
        for (Annotation annotation : annotations) {
            MyTable studentTable = (MyTable) annotation;
            System.out.println(studentTable.value());
        }

        Field f1 = c1.getDeclaredField("name"); // get a single annotation
        MyField studentField =  f1.getAnnotation(MyField.class);
        System.out.println(studentField.colName());
        System.out.println(studentField.type());
        System.out.println(studentField.length());
    }
}

@MyTable("db_student")
class MyStudent {
    @MyField(colName = "db_id", type = "int", length = 5)
    private int id;
    @MyField(colName = "db_age", type = "int", length = 3)
    private int age;
    @MyField(colName = "db_name", type = "varchar", length = 10)
    private String name;

    public MyStudent(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public MyStudent() {
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

// class annotation
@Target(value = {ElementType.TYPE,})
@Retention(value = RetentionPolicy.RUNTIME)
@interface MyTable {
    String value();
}

// field annotation
@Target(value = {ElementType.FIELD,})
@Retention(value = RetentionPolicy.RUNTIME)
@interface MyField {
    String colName();
    String type();
    int length();
}


