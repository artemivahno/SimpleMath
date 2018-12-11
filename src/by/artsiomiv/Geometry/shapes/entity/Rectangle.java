package by.artsiomiv.Geometry.shapes.entity;

public class Rectangle extends Shape {

    public void draw() {System.out.println("Rectangle.draw()");}
    public void erase() {System.out.println("Rectangle.draw()");}

    private double b;

    public Rectangle(double a, double b) {
        super(a);
        this.b = b;
    }

    public double getB() {
        return b;
    }

    public double getPerimeter() {
        return 0;
    }

    public double getSquare() {
        return 0;
    }
}
