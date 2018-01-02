package Decorator;

/**
 * Created by Mustafa on 1/2/2018.
 */
public abstract class ShapeDecorator {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public void draw() {
        decoratedShape.draw();

    }
}
