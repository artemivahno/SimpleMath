package by.artsiomiv.Geometry.shapes.action;

import by.artsiomiv.Geometry.shapes.entity.AbstractShape;
import by.artsiomiv.Geometry.shapes.entity.Rectangle;

public class RectangleAction implements IShapeAction<Rectangle> {

    @Override
    public double computeSquare(Rectangle shape) {
        return shape.getA() * shape.getB();
    }

    @Override
    public double computePerimeter(Rectangle shape) {
        return 2 * (shape.getA() + shape.getB());
    }
}
