package org.jxiang.oopAbstract;

// abstract classes can not be initialized EXPLICITLY!
public abstract class GraphicObject {
    protected int x, y;

    GraphicObject(int x, int y){
        System.out.println("Base Class Initialized!");
        this.x = x;
        this.y = y;
    }

    public void moveTo(int newX, int newY) {
        System.out.println(String.format("Move to x: %d and y: %d", newX, newY));
    }

    abstract void draw();
    abstract void resize();
}
