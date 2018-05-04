package shapes;

public class Circle {
    //---scope--type--name--
    private double radius;

    //---constructor---
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    public double getCircumference() {
        double circumference = 2 * Math.PI * radius;
        return circumference;
    }
}
