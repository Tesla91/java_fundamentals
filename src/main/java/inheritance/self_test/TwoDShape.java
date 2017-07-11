package main.java.inheritance.self_test;

/**
 * Created by nicola on 7/10/17.
 */
public class TwoDShape {
    private double width;
    private double height;

    // A default constructor.
    TwoDShape() {
        width = height = 0.0;
    }

    // Parametrized constructor.
    TwoDShape(double w, double h) {
        width = w;
        height = h;
    }

    // Construct object with equal width and height.
    TwoDShape(double x) {
        width = height = x;
    }

    // Accessor methods for width and height.
    double getWidth() { return width; }
    double getHeight() { return height; }
    void setWidth(double w) { width = w; }
    void setHeight(double h) { height = h; }

    void showDim() {
        System.out.println("Width and height are " +
                width + " and " + height);
    }
}
class Circle extends TwoDShape{

    Circle(double diameter) {
        super(diameter);
    }

    double area() {
        return ((getWidth()/2 * getWidth()/2) * Math.PI);
    }

}