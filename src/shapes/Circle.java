package shapes;

public class Circle {
    //---scope--type--name--
    private double radius;

    //---constructor--------
    public Circle(double radius) {
        this.radius = radius;
    }
    //----computes area of circle from imputed value-----
    public double getArea() {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }
    //computes circumference of circle from imputed value---
    public double getCircumference() {
        double circumference = 2 * Math.PI * radius;
        return circumference;
    }
}
