package org.jxiang.oopAbstract;

public class Circle extends GraphicObject {
    Circle(int x, int y) {
        super(x, y);
    }

    @Override
    void draw() {
        System.out.println("Draw Cycle");
    }

    @Override
    void resize() {
        System.out.println("Resize Cycle");
    }
}
