package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public void setlength(double length) {
        this.length = length;
    }

    @Override
    public void setwidth(double width) {
        this.width =width;
    }


}
