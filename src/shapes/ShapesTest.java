package shapes;

public class ShapesTest {

    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5, 5);
        Rectangle box2 = new Square(5);


        System.out.println("The area of box1 is: " + box1.getArea());
        System.out.println("The perimeter of box1 is: " + box1.getPerimeter());
        System.out.println("The perimeter of box2 with overide is: " + box2.getPerimeter());
        System.out.println("The area of box2 with overide is: " + box2.getArea());


    }

}
