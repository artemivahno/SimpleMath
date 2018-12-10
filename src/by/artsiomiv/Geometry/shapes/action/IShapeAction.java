package by.artsiomiv.Geometry.shapes.action;

import by.artsiomiv.Geometry.shapes.entity.AbstractShape;

public interface IShapeAction <T extends AbstractShape> {

    double computeSquare(T shape);
    double computePerimeter(T shape);
}
