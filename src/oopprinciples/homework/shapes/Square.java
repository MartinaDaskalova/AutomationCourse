package oopprinciples.homework.shapes;

public class Square extends Shape{

    @Override
    Double getPerimeter(double d) {
        return (d * d);
    }

    @Override
    Double getArea(double d) {
        return (4 * d);
    }
}
