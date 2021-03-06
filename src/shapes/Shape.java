package shapes;

public abstract class Shape {

    public class Square extends Rectangle {

        public Square(double side){
            super(side, side);


        }

        @Override
        public double getArea() {
            double side = length;
            double area =  Math.pow(side,2);
            return area;
        }

        @Override
        public double getPerimeter() {
            double side = length;
            double perimeter =  side * 4;
            return perimeter;
        }
    }
}
