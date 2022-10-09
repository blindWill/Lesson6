import geometricShapes.Color;
import geometricShapes.LineType;
import geometricShapes.Square;
import geometricShapes.Triangle;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(23, true,Color.GREEN, LineType.THIN);
        System.out.println(square);
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());
        System.out.println("Inscribed circle area: " + square.getInCircleArea());
        System.out.println("Diagonal: " + square.getDiagonal());

        Triangle triangle = new Triangle(5, 7, 9, Color.ORANGE, LineType.DASHED);
        System.out.println("\n"+triangle);
        triangle.checkTriangleType();
        triangle.outputHeights();
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
    }


}