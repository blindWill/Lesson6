package geometricShapes;

import java.util.Objects;

public class Triangle extends Shape implements TriangleActions {
    private int firstSide;
    private int secondSide;
    private int thirdSide;

    public Triangle(){
        super();
        firstSide = 10;
        secondSide = 10;
        thirdSide = 10;
    }
    public Triangle(int firstSide, int secondSide, int thirdSide, Color color, LineType lineType){
        super(color, lineType);
        checkIfTriangleRight(firstSide, secondSide, thirdSide);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }
    private void checkIfTriangleRight(int firstSide, int secondSide, int thirdSide){
        if ((firstSide + secondSide) < thirdSide || (firstSide + thirdSide) < secondSide
                || (secondSide + thirdSide) < firstSide){
            throw new IllegalArgumentException("Sum of two sides must be lesser then third size");
        }
    }
    @Override
    public void outputHeights(){
        System.out.println("Height connected to the first side: " + 2 * getArea() / firstSide);
        System.out.println("Height connected to the second side: " + 2 * getArea() / secondSide);
        System.out.println("Height connected to the third side: " + 2 * getArea() / thirdSide);
    }
    @Override
    public void checkTriangleType(){
        if ((firstSide == secondSide) && (firstSide == thirdSide)){
            System.out.println("The triangle is equilateral");
        } else if ((firstSide == secondSide) || (firstSide == thirdSide) || (secondSide == thirdSide)) {
            System.out.println("The triangle is isosceles");
        } else{
            System.out.println("The triangle is scalene");
        }
    }
    @Override
    public double getArea(){
        double p = getPerimeter()/2.0;
        return p * (p - firstSide) * (p - secondSide) * (p - thirdSide);
    }
    @Override
    public int getPerimeter(){
        return firstSide + secondSide + thirdSide;
    }

    public int[] getSides() {
        int[] sides = new int[]{firstSide, secondSide, thirdSide};
        return sides;
    }

    public void setSides(int firstSide, int secondSide, int thirdSide) {
        checkIfTriangleRight(firstSide, secondSide, thirdSide);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return firstSide == triangle.firstSide && secondSide == triangle.secondSide && thirdSide == triangle.thirdSide
                && getColor() == triangle.getColor() && getLineType() == triangle.getLineType();
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstSide, secondSide, thirdSide, getColor(), getLineType());
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "firstSide = " + firstSide +
                ", secondSide = " + secondSide +
                ", thirdSide = " + thirdSide +
                ", color = " + getColor() +
                ", line type = " + getLineType() +
                '}';
    }
}
