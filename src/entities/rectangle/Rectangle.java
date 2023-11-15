package entities.rectangle;

public class Rectangle {

    public double width;
    public double height;

    public double area() {
        return (width * height);
    }

    public double perimeter() {
        return (width * 2) + (height * 2);
    }

    public double diagonal() {
        return Math.sqrt(width * width + height * height);
    }

    public String toString() {
        return String.format("AREA = %.2f ", area())
                + String.format("\nPERIMETER = %.2f ", perimeter())
                + String.format("\nDIAGONAL = %.2f ", diagonal());
    }
}
