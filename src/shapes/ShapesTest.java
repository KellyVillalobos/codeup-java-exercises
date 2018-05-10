package shapes;

public class ShapesTest {

    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(5, 4);
//        Rectangle box2 = new Square(5);


//        System.out.println("The area of box1 is: " + box1.getArea());
//        System.out.println("The perimeter of box1 is: " + box1.getPerimeter());
//        System.out.println("The perimeter of box2 with override is: " + box2.getPerimeter());
//        System.out.println("The area of box2 with override is: " + box2.getArea());
//        System.out.println(box1);
//        System.out.println(box2);

        Measurable myShape1;
        Measurable myShape2;
        Measurable myShape3;

        myShape1 = new Square(5,5);
        myShape2 = new Rectangle(5, 4);

        System.out.println(myShape1.getPerimeter());
        System.out.println(myShape1.getArea());
        System.out.println(myShape2.getPerimeter());
        System.out.println(myShape2.getPerimeter());


    }

}


