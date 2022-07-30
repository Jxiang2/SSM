package org.jxiang.oopAbstract;

public class Demo {
    public static void main(String[] args) {
        GraphicObject circle = new Circle(5, 10);
        circle.draw();
        circle.resize();

        GraphicObject rectangle = new Rectangle(1, 2);
        rectangle.draw();
        rectangle.resize();
    }
}
