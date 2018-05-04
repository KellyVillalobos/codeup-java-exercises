package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();

        int radius = input.getInt("Enter radius of circle: ");
        Circle circle = new Circle(radius);
        double area = circle.getArea();
        double circumference = circle.getCircumference();
        System.out.println("The area of the circle is " + Math.round(area));
        System.out.println("The circumference of the circle is " + Math.round(circumference));
    }




}
