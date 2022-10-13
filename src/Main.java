import geometricShapes.Color;
import geometricShapes.LineType;
import geometricShapes.Square;
import geometricShapes.Triangle;

public class Main {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());
        System.out.println("Inscribed circle area: " + square.getInCircleArea());
        System.out.println("Diagonal: " + square.getDiagonal() + "\n");

        Triangle triangle = new Triangle(10, 7, 100, Color.ORANGE, LineType.DASHED);
        System.out.println(triangle);
        triangle.checkTriangleType();
        triangle.outputHeights();
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
    }


}