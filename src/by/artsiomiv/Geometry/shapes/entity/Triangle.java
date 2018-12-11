package by.artsiomiv.Geometry.shapes.entity;

public class Triangle extends Shape {

    public void draw() {System.out.println("Triangle.draw()");}
    public void erase() {System.out.println("Triangle.draw()");}


    private double b;
    private double c;
    private double angle;
    public Triangle(double a, double b, double angle) {
        super(a);
        this.b = b;
        this.angle = angle;
    }

    public double getB() {
        return b;
    }

    public double getAngle() {
        return angle;
    }

    public double getC() {
        double c; // теорема косинусов
        c = Math.pow(getA(), 2) + Math.pow(getB(), 2) - 2 * getA() * getB() * Math.cos(getAngle());

        return c;
    }
}
