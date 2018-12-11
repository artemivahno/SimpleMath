package by.artsiomiv.Geometry;

import by.artsiomiv.Geometry.shapes.RandomShapeGenerator;
import by.artsiomiv.Geometry.shapes.action.IShapeAction;
import by.artsiomiv.Geometry.shapes.action.RectangleAction;
import by.artsiomiv.Geometry.shapes.action.TriangleAction;
import by.artsiomiv.Geometry.shapes.entity.Rectangle;
import by.artsiomiv.Geometry.shapes.entity.Shape;
import by.artsiomiv.Geometry.shapes.entity.Triangle;

import static java.lang.Math.PI;

public class Main {

    private static RandomShapeGenerator gen = new RandomShapeGenerator();

    public static void main (String[] args) {

        IShapeAction action;

        Rectangle rectShape = new Rectangle(5, 7);
        action = new RectangleAction();
        System.out.println("Square rectangle: " + action.computeSquare(rectShape));
        System.out.println("Perimeter rectangle: " + action.computePerimeter(rectShape));

        Triangle trShape = new Triangle(8, 5, PI / 6);
        action = new TriangleAction();
        System.out.println("Square triangle: " + action.computeSquare(trShape));
        System.out.println("Perimeter triangle: " + action.computePerimeter(trShape));

        Shape [] s = new Shape[10];
        //заполняем фигурами
        for (int i =0; i<s.length; i++){
            s[i] = (Shape) gen.next();
        }

        //полиморфные вызовы методов
        for (Shape shape : s) {
            shape.draw();
        }
    }
}
