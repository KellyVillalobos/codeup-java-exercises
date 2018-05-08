package shapes;

public class Square extends Rectangle {

    public Square(int side){
        super(side, side);

    }

    @Override
    public int getArea() {
        int side = length;
        int area = (int) Math.pow(side,2);
        return area;
    }

    @Override
    public int getPerimeter() {
        int side = length;
       int perimeter =  side * 4;
        return perimeter;
    }
}
