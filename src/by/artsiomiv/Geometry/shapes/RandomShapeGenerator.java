package by.artsiomiv.Geometry.shapes;

import by.artsiomiv.Geometry.shapes.entity.AbstractShape;
import by.artsiomiv.Geometry.shapes.entity.Circle;
import by.artsiomiv.Geometry.shapes.entity.Rectangle;
import by.artsiomiv.Geometry.shapes.entity.Triangle;

import java.util.*;

public class RandomShapeGenerator {

    private Random rand = new Random(50);

    public AbstractShape next() {

        switch (rand.nextInt(3)) {
            default:
            case 0: return new Circle(15.4);
            case 1: return new Rectangle(11.2,5);
            case 2: return new Triangle(5,10, 15.3);

        }

    }
}
