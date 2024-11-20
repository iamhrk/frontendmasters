package objects;

public class Rectangle {
    private double length;
    private double width;
    int sides = 4;

    public Rectangle(){
        setLength(0);
        setWidth(0);
    }

    public Rectangle(double length, double width){
        setWidth(width);
        setLength(length);
    }

    public double calculatePerimeter(){
        return (2* (length + width));
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    public double calculateArea(){
        return length * width;
    }
}
