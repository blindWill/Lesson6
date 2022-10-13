package geometricShapes;

import java.util.Objects;

public abstract class Shape {
    private Color color;
    private LineType lineType;
    Shape(){
        color = Color.RED;
        lineType = LineType.BASE;
    }
    Shape(Color color, LineType lineType){
        this.color = color;
        this.lineType = lineType;
    }
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public LineType getLineType() {
        return lineType;
    }
    public void setLineType(LineType lineType) {
        this.lineType = lineType;
    }
    public abstract double getArea();
    public abstract int getPerimeter();

}
