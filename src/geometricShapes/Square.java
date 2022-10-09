package geometricShapes;

import java.util.Objects;

public class Square extends Shape{
    private int side;
    private boolean hasInCircle;

    public Square(){
        super();
        int side = 10;
        hasInCircle = false;
    }
    public Square(int side, boolean hasInCircle, Color color, LineType lineType){
        super(color, lineType);
        this.hasInCircle = hasInCircle;
        this.side = side;
    }

    public double getDiagonal(){
        return side * Math.sqrt(2);
    }

    public double getInCircleArea(){
        if (hasInCircle){
            return Math.pow(side/2.0, 2) * Math.PI;
        } else{
            System.out.println("There is no inscribed circle");
            return 0;
        }
    }
    @Override
    public double getArea(){
        return side * side;
    }
    @Override
    public int getPerimeter(){
        return side * 4;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public boolean isHasInCircle() {
        return hasInCircle;
    }

    public void setHasInCircle(boolean hasInCircle) {
        this.hasInCircle = hasInCircle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return side == square.side && hasInCircle == square.hasInCircle && getColor() == square.getColor() && getLineType() == square.getLineType();
    }

    @Override
    public int hashCode() {
        return Objects.hash(side, hasInCircle, getColor(), getLineType());
    }

    @Override
    public String toString() {
        return "Square{" +
                "side = " + side +
                ", has inscribed circle = " + hasInCircle +
                ", color = " + getColor() +
                ", line type = " + getLineType() +
                '}';
    }
}
