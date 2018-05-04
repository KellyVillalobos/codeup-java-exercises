package shapes;
//----imported from input.java class
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        //-----creates new Input object--------
        Input input = new Input();
        //----prompts user for number of radius--------
        int radius = input.getInt();
        //----creates new Circle object----
        Circle circle = new Circle(radius);
        //----passes input values to a double----
        double area = circle.getArea();
        double circumference = circle.getCircumference();
        //---SOUTs computed area and circumference to the terminal-----
        System.out.println("The area of the circle is " + Math.round(area));
        System.out.println("The circumference of the circle is " + Math.round(circumference));
    }




}
